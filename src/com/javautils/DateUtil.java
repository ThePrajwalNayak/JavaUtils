package com.javautils;

/**
 * DateUtil class provide functionality to work with Date
 * 
 * @author prajwalnayak
 *
 */
public class DateUtil {

	/**
	 * convertSqlToUtilDate convert SQL date to Util date
	 * 
	 * @param sqlDate
	 * @return utilDate
	 */
	public static java.util.Date convertSqlToUtilDate(java.sql.Date sqlDate) {
		if (sqlDate != null) {
			return new java.util.Date(sqlDate.getTime());
		}
		return null;
	}

	/**
	 * convertUtilToSqlDate converts util Date to SQL date
	 * 
	 * @param utilDate
	 * @return sqlDate
	 */
	public static java.sql.Date convertUtilToSqlDate(java.util.Date utilDate) {
		if (utilDate != null) {
			return new java.sql.Date(utilDate.getTime());
		}
		return null;
	}
}
