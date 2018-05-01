package com.learnSpring.beanPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/main/java/com/learnSpring/beanPostProcessor/bean-postProcessor.xml");
		Customer customer = context.getBean("customer", Customer.class);
		System.out.println(customer.getName());
	}
}
