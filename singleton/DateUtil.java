package com.patterns.singleton;

public class DateUtil {
	
	private DateUtil(){
		
	}
	
	static DateUtil instance;
	static DateUtil getInstance() {
		if(instance == null)
		instance = new DateUtil();
		return instance;
		
	}

}
