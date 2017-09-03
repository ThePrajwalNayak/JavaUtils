package com.javautils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.javautils.ApplicationConstants.SQL_CONSTANTS;

public class SQLUtil {

	/**
	 * getConnection method provide connection using ApplicationConstants interface
	 * fields
	 * 
	 * @return connection
	 */
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(SQL_CONSTANTS.JDBC_DRIVER);
			return DriverManager.getConnection(SQL_CONSTANTS.DB_URL, SQL_CONSTANTS.USER, SQL_CONSTANTS.PASSWORD);
		} catch (Exception e) {

		}
		return conn;
	}

	/**
	 * closeConnection to close data base connection
	 * 
	 * @param connection
	 */
	public void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * closeStatement to close data base statement i/o connection
	 * 
	 * @param statement
	 */
	public void closeStatement(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * closePreparedStatement to close data base preparedStatement i/o connection
	 * 
	 * @param preparedStatement
	 */
	public void closePreparedStatement(PreparedStatement preparedStatement) {
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * closeResultSet to close data base resultSet i/o connection
	 * 
	 * @param resultSet
	 */
	public void closeResultSet(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
