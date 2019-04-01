package com.uber.utils;

import java.io.File;

public class CleaningDB {

	public static void deleteDB() {
		File file = new File("database.db"); 

		if (file.exists()) {
			if (!file.delete()) {
				throw new IllegalArgumentException();
			}
		}
	}
}
