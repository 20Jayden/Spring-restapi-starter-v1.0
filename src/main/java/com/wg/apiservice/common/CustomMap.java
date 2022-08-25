package com.wg.apiservice.common;

import java.util.HashMap;

public class CustomMap extends HashMap<String, Object> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5864078051940468752L;

	public Object put(String key, Object value) {
		System.out.println("~~~~~" + key);
        return super.put(key.toLowerCase(), value);
    }
}
