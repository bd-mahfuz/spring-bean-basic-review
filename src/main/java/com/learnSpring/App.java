package com.learnSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
        
        Hello hello = (Hello) context.getBean("helloBean");
        
        hello.setMessage("First Message");
        
        System.out.println(hello.getMessage());
    }
}
