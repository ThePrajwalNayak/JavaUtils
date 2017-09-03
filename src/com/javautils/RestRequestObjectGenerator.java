/**
 * 
 */
package com.javautils;

import org.json.simple.JSONObject;

/**
 * @author prajwalnayak
 *
 */
public class RestRequestObjectGenerator {

	@SuppressWarnings("unchecked")
	public String createTestRequestObject() {
		JSONObject requestObj = new JSONObject();
		requestObj.put("name", "nayak");
		requestObj.put("password", "password");
		return requestObj.toString();
	}
}
