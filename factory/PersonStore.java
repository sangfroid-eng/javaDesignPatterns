package com.patterns.factory;

public class PersonStore {
	
	void create(String type)
	{
		Person p = PersonFactory.create(type);
		
		
		p.wish();
}

}
