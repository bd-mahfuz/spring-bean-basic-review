package com.learnSpring.requiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/requiredAnnotation/required-annotation.xml");
		Customer customer= context.getBean("customer", Customer.class);
		System.out.println(customer.getName());
	}
}
