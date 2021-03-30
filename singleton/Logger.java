package com.patterns.singleton;

import java.io.Serializable;

import java.lang.*;

public class Logger implements Serializable,Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Logger() {
		
	}
	
	private volatile static Logger instance;
	
	static Logger getInstance() {
		
		if(instance == null) {
			synchronized(Logger.class) {
				if(instance ==  null)
			instance = new Logger();
			}
		}
		return instance;
		}
	
	void  log(String msg) {
		System.out.println(msg);
		
	}
		
	protected Object readResolve() {
		return instance;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
		
	}

}
