package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		Student student = (Student) context.getBean("student");
		
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		

		
	}

}
