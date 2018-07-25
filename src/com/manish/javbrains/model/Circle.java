package com.manish.javbrains.model;

import javax.management.RuntimeErrorException;

public class Circle {
	private String name;
	@Loggable
	public String getName() {
		if(name==null)
		throw new RuntimeErrorException(null);
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
		
	}
}
