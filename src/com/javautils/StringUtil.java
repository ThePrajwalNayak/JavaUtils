package com.javautils;

/**
 * StringUtil class provide functionality to work with String
 * 
 * @author prajwalnayak
 *
 */
public class StringUtil {

	/**
	 * isString checks if String is null or empty
	 * 
	 * @param String
	 * @return boolean
	 */
	public static boolean isStringEmtpy(String input) {
		if (input == null || input.trim().length() <= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * isStringNotEmpty checks if string is not null, not empty
	 * 
	 * @param input
	 * @return boolean
	 */
	public static boolean isStringNotEmpty(String input) {
		if (input == null || input.trim().length() <= 0) {
			return false;
		} else {
			return true;
		}
	}

}
