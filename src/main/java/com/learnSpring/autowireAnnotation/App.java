package com.learnSpring.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext  context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/autowireAnnotation/auto-wireAnnotation.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student.getAddress().getCity());
	}

}
