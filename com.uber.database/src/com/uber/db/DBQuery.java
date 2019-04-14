package com.uber.db;

import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBQuery {

	public static List<Driver> selectAllDrivers() {
		List<Driver> drivers = new ArrayList<>();

		String sql = "SELECT id, name, age, car_number, rating_id FROM person, driver WHERE person.id = driver.person_id";

		try (Connection conn = DBCreator.connect();
				Statement stmt  = conn.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)) {

			while (rs.next()) {
				Driver driver = new Driver();
				driver.setId(rs.getInt("id"));
				driver.setAge(rs.getInt("age"));
				driver.setName(rs.getString("name"));
				driver.setCarNumber(rs.getString("car_number"));
				driver.setRating(getRating(rs.getInt("rating_id")));

				drivers.add(driver);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return drivers;
	}

	public static Driver selectDriver(int driverID) {
		Driver driver = null;

		String sql = "SELECT id, name, age, car_number, rating_id FROM person, driver WHERE person.id = driver.person_id AND person.id = ?";

		try (Connection conn = DBCreator.connect();
				PreparedStatement pstmt  = conn.prepareStatement(sql)) {
			pstmt.setInt(1, driverID);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				driver = new Driver();
				driver.setId(rs.getInt("id"));
				driver.setAge(rs.getInt("age"));
				driver.setName(rs.getString("name"));
				driver.setCarNumber(rs.getString("car_number"));
				driver.setRating(getRating(rs.getInt("rating_id")));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}

	public static List<Customer> selectAllCustomers() {
		List<Customer> customers = new ArrayList<>();

		String sql = "SELECT id, name, age, card_number, rating_id FROM person, customer WHERE person.id = customer.person_id";

		try (Connection conn = DBCreator.connect();
				Statement stmt  = conn.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)) {

			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt("id"));
				customer.setAge(rs.getInt("age"));
				customer.setName(rs.getString("name"));
				customer.setCardNumber(rs.getString("card_number"));
				customer.setRating(getRating(rs.getInt("rating_id")));

				customers.add(customer);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return customers;
	}


	public static Customer selectCustomer(int customerID) {
		Customer customer = null;

		String sql = "SELECT id, name, age, card_number, rating_id FROM person, customer WHERE person.id = customer.person_id AND person.id = ?";

		try (Connection conn = DBCreator.connect();
				PreparedStatement pstmt  = conn.prepareStatement(sql)) {
			pstmt.setInt(1, customerID);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				customer = new Customer();
				customer.setId(rs.getInt("id"));
				customer.setAge(rs.getInt("age"));
				customer.setName(rs.getString("name"));
				customer.setCardNumber(rs.getString("card_number"));
				customer.setRating(getRating(rs.getInt("rating_id")));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return customer;
	}

	public static double getRating(int ratingID) {
		String sql = "SELECT count, rating_sum FROM feedback WHERE id = ?";

		double rating = 0;
		try (Connection conn = DBCreator.connect();
				PreparedStatement pstmt  = conn.prepareStatement(sql)) {
			pstmt.setInt(1, ratingID);

			ResultSet rs = pstmt.executeQuery();
			// should be just one..
			if (rs.next()) {
				rating = rs.getDouble("rating_sum") / rs.getInt("count");
			} else {
				throw new IllegalArgumentException();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rating;
	}

	public static void updateFeedback(int personID, double rating) {
		int ratingID = 0;
		int count = 0;
		double rating_sum = 0;
		String sql = "SELECT feedback.id, count, rating_sum FROM feedback JOIN person ON person.rating_id = feedback.id WHERE person.id = ?";

		try (Connection conn = DBCreator.connect();
				PreparedStatement pstmt  = conn.prepareStatement(sql)) {
			pstmt.setInt(1, personID);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				ratingID = rs.getInt("id");
				count = rs.getInt("count");
				rating_sum = rs.getDouble("rating_sum");
			} else {
				throw new IllegalArgumentException();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		sql = "UPDATE feedback SET rating_sum = ? , "
				+ "count = ? "
				+ "WHERE id = ?";

		try (Connection conn = DBCreator.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setDouble(1, rating_sum + rating);
			pstmt.setInt(2, ++count);
			pstmt.setInt(3, ratingID);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static double getRatingOf(int personID) {
		String sql = "SELECT count, rating_sum FROM feedback JOIN person ON person.rating_id = feedback.id WHERE person.id = ?";

		double rating = 0;
		try (Connection conn = DBCreator.connect();
				PreparedStatement pstmt  = conn.prepareStatement(sql)) {
			pstmt.setInt(1, personID);

			ResultSet rs = pstmt.executeQuery();
			// should be just one..
			if (rs.next()) {
				System.out.println(rs.getInt("count") +  "\t" + 
						rs.getDouble("rating_sum"));
				rating = rs.getDouble("rating_sum") / rs.getInt("count");
			} else {
				throw new IllegalArgumentException();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rating;
	}
}
