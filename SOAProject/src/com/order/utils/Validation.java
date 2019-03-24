package com.order.utils;

import com.order.datatypes.Customer;
import com.order.datatypes.Driver;
import com.order.datatypes.Location;
import com.order.db.DBQuery;

public class Validation {

	@SuppressWarnings("unchecked")
	public static <T extends Exception> void validateLocation(Location location, Exception ex) throws T {
		if (location.getLattitude() < -90.0 || location.getLattitude() > 90.0) {
			throw (T) ex;
		}

		if (location.getLongitude() < -180.0 || location.getLongitude() > 180.0) {
			throw (T) ex;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends Exception> void validateDriver(Driver driver, Exception ex) throws T {
		if(driver == null) {
			throw (T) ex;
		}

		Driver dbDriver = DBQuery.selectDriver(driver.getId());
		if (dbDriver == null) {
			throw (T) ex;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends Exception> void validateCustomer(Customer customer, Exception ex) throws T {
		if(customer == null) {
			throw (T) ex;
		}

		Customer dbCustomer = DBQuery.selectCustomer(customer.getId());
		if (dbCustomer == null) {
			throw (T) ex;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends Exception> void validatePrice(double price, Exception ex) throws T {
		if (Double.isNaN(price) || price == 0) {
			throw (T) ex;
		}
	}
	@SuppressWarnings("unchecked")
	public static <T extends Exception> void validateCardNumber(String cardNumber, Exception ex) throws T {
		String regex = "^[aA-zZ][aA-zZ][0-9][0-9][0-9][0-9][0-9][0-9]$";
		if (!cardNumber.matches(regex)) {
			throw (T) ex;
		}
	}
}