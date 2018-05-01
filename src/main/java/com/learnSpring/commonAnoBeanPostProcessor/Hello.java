package com.learnSpring.commonAnoBeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hello {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("calling init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("calling destroy method");
	}
	
}
