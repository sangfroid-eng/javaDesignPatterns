package com.patterns.factory;

public class PersonFactory {
	
	static Person p;
	
	static Person create(String type) {
		
		if(type == "male")
			p= new Male();
	
	else if(type == "female")
		p= new Female();
		
		return p;
		
	}

}
