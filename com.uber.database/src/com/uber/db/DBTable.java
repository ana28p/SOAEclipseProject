package com.uber.db;

public enum DBTable {
	
	PERSON ("person") {
		@Override
		public String getCreateTableSql() {
			return "CREATE TABLE IF NOT EXISTS person (\n"
					+ "	id integer PRIMARY KEY,\n"
					+ "	name text NOT NULL,\n"
					+ "	age integer,\n"
					+ "	rating_id integer,\n"
					+ " UNIQUE (id, rating_id),\n"
					+ " FOREIGN KEY (rating_id) REFERENCES feedback (id) "
					+ "            ON DELETE CASCADE ON UPDATE NO ACTION"
					+ ");";
		}

		/**
		 * returns a formatted string to replace: name (string), age (int), rating_id (int)
		 */
		@Override
		public String getInsertSql() {
			return "INSERT INTO person(id, name, age, rating_id) VALUES (?, ?, ?, ?);";
		}
	},
	
	DRIVER ("driver") {
		@Override
		public String getCreateTableSql() {
			return "CREATE TABLE IF NOT EXISTS driver (\n"
					+ "	person_id integer NOT NULL,\n"
					+ "	car_number text NOT NULL,\n"
					+ "	PRIMARY KEY (person_id, car_number),\n"
					+ " FOREIGN KEY (person_id) REFERENCES person (id) "
					+ "            ON DELETE CASCADE ON UPDATE NO ACTION"
					+ ");";
		}

		/**
		 * returns a formatted string to replace: person_id (int), car_number (string)
		 */
		@Override
		public String getInsertSql() {
			return "INSERT INTO driver(person_id, car_number) VALUES (?, ?);";
		}
	},
	
	CUSTOMER ("customer") {
		@Override
		public String getCreateTableSql() {
			return "CREATE TABLE IF NOT EXISTS customer (\n"
					+ "	person_id integer NOT NULL,\n"
					+ "	card_number text NOT NULL,\n"
					+ "	PRIMARY KEY (person_id, card_number),\n"
					+ " FOREIGN KEY (person_id) REFERENCES person (id) "
					+ "            ON DELETE CASCADE ON UPDATE NO ACTION"
					+ ");";
		}

		/**
		 * returns a formatted string to replace: person_id (int), card_number (string)
		 */
		@Override
		public String getInsertSql() {
			return "INSERT INTO customer(person_id, card_number) VALUES (?, ?);";
		}
	},
	
	FEEDBACK ("feedback") {
		@Override
		public String getCreateTableSql() {
			return "CREATE TABLE IF NOT EXISTS feedback (\n"
					+ "	id integer PRIMARY KEY,\n"
					+ "	count integer DEFAULT 0,\n"
					+ "	rating_sum real\n"
					+ ");";
		}

		/**
		 * returns a formatted string to replace: count (int), rating_sum (float)
		 */
		@Override
		public String getInsertSql() {
			return "INSERT INTO feedback(id, count, rating_sum) VALUES (?, ?, ?);";
		}
	};

	private String name;
	
	private DBTable(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String getCreateTableSql();
	
	public abstract String getInsertSql();

}
