package com.learnSpring.setFactoryBean;

import java.util.Map;

public class Employee {

	private Map<String, String> name;

	public Map<String, String> getName() {
		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;
	}

	public void show() {
		for(String name: this.name.values()) {
			System.out.println(name);
		}
	}
	
	
}
