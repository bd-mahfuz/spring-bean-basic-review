package com.learnSpring.listFactoryBean;

import java.util.List;

public class Employee {

	private List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public void show() {
		for(String name: name) {
			System.out.println(name);
		}
	}
	
	
}
