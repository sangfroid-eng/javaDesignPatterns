package com.patterns.template;

public abstract class DataRenderer {
	
	public void render() {
		
		String data = readData();
		String prData = processData(data);
		System.out.println(prData);
		
	}
	
	public abstract String readData();

	public abstract String processData(String data);
}
