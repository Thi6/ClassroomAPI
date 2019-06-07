package com.qa.util;

import com.google.gson.Gson;



public class JSONUtil {

	private Gson gson;
	
	
	public JSONUtil() {
		this.gson = new Gson();
	}
	
	//GET JSON FROM OBJECT
	public String getJSONForObject(Object obj) {
		return gson.toJson(obj);
	}

	//GET OBJECT FROM JSON
	public <T> T getObjectForJSON(String jsonString, Class<T> clazz) {
		return gson.fromJson(jsonString, clazz);
	}
	
	

}