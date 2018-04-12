package com.learnSpring.beanScope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com/learnSpring/beanScope/bean-scope.xml");
		HelloWorld  hw = context.getBean("hello", HelloWorld.class);
		hw.setMessage("Hello World !!!");
		System.out.println(hw.getMessage());
		
		HelloWorld  hw2 = context.getBean("hello", HelloWorld.class);
		System.out.println(hw2.getMessage());
	}
}
