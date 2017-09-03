package com.javautils;

import java.util.List;

/**
 * ListUtil class provide functionality to work with collection list
 * 
 * @author prajwalnayak
 *
 */
public class ListUtil {

	/**
	 * isListNullOrEmpty checks if list is null or empty
	 * 
	 * @param list
	 * @return boolean
	 */
	public static boolean isListNullOrEmpty(List<?> list) {
		if (list == null || list.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * isListNotNullOrEmpty checks if list is not null or empty
	 * 
	 * @param list
	 * @return boolean
	 */
	public static boolean isListNotNullOrEmpty(List<?> list) {
		if (list == null || list.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
