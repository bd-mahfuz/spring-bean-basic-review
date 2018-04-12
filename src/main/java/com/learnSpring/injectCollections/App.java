package com.learnSpring.injectCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/injectCollections/inject-collections.xml");
		Student student = context.getBean("student", Student.class);
		student.showList();
		
		Student student2 = context.getBean("student2", Student.class);
		student2.showSet();
		
		Student student3 = context.getBean("student3", Student.class);
		student3.showMap();
		
		Student student4 = context.getBean("student4", Student.class);
		student4.showProperties();
	}

}
