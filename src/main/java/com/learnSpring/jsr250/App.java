package com.learnSpring.jsr250;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.learnSpring.jsr250.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext  context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/jsr250/jsr250.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student.getAddress().getCity());
	}

}
