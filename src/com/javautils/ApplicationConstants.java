package com.javautils;

/**
 * Application constants goes here
 * 
 * @author prajwalnayak
 *
 */
public interface ApplicationConstants {

	/**
	 * SQL_CONSTANTS contains data base related properties
	 * 
	 * @author prajwalnayak
	 *
	 */
	public interface SQL_CONSTANTS {
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost/EMP";
		static final String USER = "username";
		static final String PASSWORD = "password";
	}
}
