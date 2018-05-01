package com.learnSpring.propertyPlaceHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/propertyPlaceHolder/property-placeholder.xml");
		
		Supplier sup = context.getBean("supp", Supplier.class);
		System.out.println(sup.getAddress());
	}

}
