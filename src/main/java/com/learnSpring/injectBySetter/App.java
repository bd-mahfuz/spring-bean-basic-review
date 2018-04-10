package com.learnSpring.injectBySetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/injectBySetter/spring-module.xml");
		
//		Student s = context.getBean("student", Student.class);
//		System.out.println(s.getName());
		
//		Student s2 = context.getBean("student2", Student.class);
//		System.out.println(s.getName());
//		System.out.println(s.getCourse());
		
		Student s3 = context.getBean("student3", Student.class);
		System.out.println(s3.getName());
		s3.showCourseList();
	}

}
