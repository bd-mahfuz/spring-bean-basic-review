package com.learnSpring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/autowiring/autowire.xml");
		Mobile mobile = context.getBean("mobile", Mobile.class);
		mobile.show();
	}

}
