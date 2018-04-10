package com.learnSpring.beanInherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/beanInherit/bean-inherite.xml");
		Student student = context.getBean("student2", Student.class);
		student.show();
	}
}
