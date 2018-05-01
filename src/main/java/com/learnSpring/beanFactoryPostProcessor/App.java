package com.learnSpring.beanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/main/java/com/learnSpring/beanFactoryPostProcessor/beanFactory-postProcessor.xml");
		
		Hello hello = context.getBean("hello", Hello.class);
		System.out.println(hello.getMessage());
	}
}
