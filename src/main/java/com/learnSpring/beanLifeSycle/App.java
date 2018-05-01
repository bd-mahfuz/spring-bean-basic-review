package com.learnSpring.beanLifeSycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/beanLifeSycle/bean-lifeCycle.xml");
		context.registerShutdownHook();
//		Employee em = context.getBean("emp", Employee.class);
//		System.out.println(em.getEmpName());
		
		Supplier su = context.getBean("sup", Supplier.class);
		System.out.println(su.getName());
	}
}
