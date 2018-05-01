package com.learnSpring.withoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Customer customer = context.getBean("customer", Customer.class);
		customer.welcomeMessage("hello world");
		
		Supplier suplier = context.getBean("supplier", Supplier.class);
		System.out.println(suplier);
	}
	
	
}
