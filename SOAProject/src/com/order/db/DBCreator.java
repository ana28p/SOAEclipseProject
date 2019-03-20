package com.order.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCreator {

	private static final String JDBC_SQLITE_DB = "jdbc:sqlite:database.db"; // the file is created in the project root

	public static void initializeDB() {
		createNewDatabase();

		createNewTable(DBTable.FEEDBACK);
		createNewTable(DBTable.PERSON);
		createNewTable(DBTable.CUSTOMER);
		createNewTable(DBTable.DRIVER);

		populateDB();
	}

	private static void createNewDatabase() {
		try (Connection conn = connect()) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void createNewTable(DBTable dbTable) {
		String sql = dbTable.getCreateTableSql();

		try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(JDBC_SQLITE_DB);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

	private static void insert(String sql, Object... args) {
		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			for (int i = 0; i < args.length; i ++) {
				if (args[i] instanceof String) {
					pstmt.setString(i+1, (String) args[i]);
				} else if (args[i] instanceof Double) {
					pstmt.setDouble(i+1, (double) args[i]);
				} else if (args[i] instanceof Integer) {
					pstmt.setInt(i+1, (int) args[i]);
				}
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void populateDB() {
		String[]      names = {"John Doe", "Liza Teed", "Myra Kirton", "Signe Foye", "Jasper Lowe", "Guy Koll"};
		Integer[] 	   ages = {        42,		    18, 		   40,		     27,			21,         25};
		Double[]  ratingSum = {        5d,		   9.5, 		  20d,		    15d,		   18d,        40d};
		Integer[]     count = {         1,		     2, 		    5,		      3,			 4,          9};
		String[]      carNo = {  "TM2312",   "GJ98394",      "EN4323",    "UT39834",      "JL4944",   "GK3234"};
		String[]     cardNo = {"NL955355",  "NL805425",    "NL366732",   "NL261981",    "NL671226", "NL708127"};

		for (int i = 0; i < names.length; i++) {
			insert(DBTable.FEEDBACK.getInsertSql(), i+1, count[i], ratingSum[i]);
			insert(DBTable.PERSON.getInsertSql(), i+1, names[i], ages[i], i+1);
			if (i % 2 == 0) {
				insert(DBTable.DRIVER.getInsertSql(), i+1, carNo[i]);
			} else {
				insert(DBTable.CUSTOMER.getInsertSql(), i+1, cardNo[i]);
			}
		}

	}

	public static void main(String[] args) {
		initializeDB();
		//		System.out.println(DBQuery.selectAll(DBTable.PERSON));
		System.out.println("rating of person with id 3: " + DBQuery.getRatingOf(3));
		System.out.println("rating of person with id 4: " + DBQuery.getRatingOf(4));
		DBQuery.updateFeedback(3, 4.5);
		System.out.println("new rating of person with id 3: " + DBQuery.getRatingOf(3));
		//		System.out.println(DBTable.CUSTOMER.getInsertSql());
	}
}
