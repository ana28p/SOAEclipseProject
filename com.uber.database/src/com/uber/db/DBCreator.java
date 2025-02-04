package com.uber.db;

import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import org.sqlite.JDBC;

import java.io.File;
import java.sql.*;
import java.util.List;

public class DBCreator {

	private static final String FILE_NAME = "uber.db"; // the file is created in the project root
	private static final String JDBC_SQLITE_DB = "jdbc:sqlite:" + FILE_NAME;

	public static void initializeDB() {
		createNewDatabase();

		createNewTable(DBTable.FEEDBACK);
		createNewTable(DBTable.PERSON);
		createNewTable(DBTable.CUSTOMER);
		createNewTable(DBTable.DRIVER);

		populateDB();
	}
	
	public static boolean databaseExists(){
		File file = new File(FILE_NAME);
		return file.exists();
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
			DriverManager.registerDriver(new JDBC());
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
		System.out.println("rating of person with id 3: " + String.format( "%.2f",DBQuery.getRatingOf(3)));
		System.out.println("rating of person with id 4: " + String.format( "%.2f",DBQuery.getRatingOf(4)));
		DBQuery.updateFeedback(3, 4.5);
		System.out.println("new rating of person with id 3: " + String.format( "%.2f",DBQuery.getRatingOf(3)));

		List<Driver> drivers = DBQuery.selectAllDrivers();
		drivers.forEach(d -> System.out.println("id: " + d.getId()
											+ ", name: " + d.getName()
											+ ", age: " + d.getAge()
											+ ", carNo: " + d.getCarNumber()
											+ ", rating: " + String.format( "%.2f", d.getRating())
											));
		List<Customer> customers = DBQuery.selectAllCustomers();
		customers.forEach(c -> System.out.println("id: " + c.getId()
											+ ", name: " + c.getName()
											+ ", age: " + c.getAge()
											+ ", cardNo: " + c.getCardNumber()
											+ ", rating: " + String.format( "%.2f", c.getRating())
											));
	}
}
