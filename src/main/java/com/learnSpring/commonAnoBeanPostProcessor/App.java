package com.learnSpring.commonAnoBeanPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/commonAnoBeanPostProcessor/common-annotation.xml");
		context.registerShutdownHook();
		Hello hello = context.getBean("hello", Hello.class);
		System.out.println(hello.getMessage());
	}

}
