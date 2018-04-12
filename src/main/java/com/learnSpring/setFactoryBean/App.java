package com.learnSpring.setFactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/src/main/java/com/learnSpring/setFactoryBean/set-factoryBean.xml");
//		Employee em = context.getBean("emp", Employee.class);
//		em.show();
		
		Employee em = context.getBean("emp2", Employee.class);
		em.show();
	}

}
