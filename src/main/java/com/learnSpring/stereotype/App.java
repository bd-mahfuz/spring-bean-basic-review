package com.learnSpring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.learnSpring.stereotype.Mobile;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(""
				+ "/src/main/java/com/learnSpring/stereotype/stereotype.xml");
		Mobile mobile = context.getBean("mobile", Mobile.class);
		mobile.setName("Samsung");
		mobile.setModel("s6");
		mobile.show();
	}

}
