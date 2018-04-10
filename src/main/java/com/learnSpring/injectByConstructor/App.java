package com.learnSpring.injectByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/injectByConstructor/spring-module.xml");
//		Employee em = context.getBean("em", Employee.class);
//		System.out.println(em);
		
//		Employee em2 = context.getBean("em2", Employee.class);
//		System.out.println(em2);
		
//		Employee em3 = context.getBean("em3", Employee.class);
//		System.out.println(em3);
		
//		Employee em4 = context.getBean("em4", Employee.class);
//		em4.showEmWithAddressList();
		
		Employee em5 = context.getBean("em5", Employee.class);
		em5.showEmWithStringList();
		
		
	}

}
