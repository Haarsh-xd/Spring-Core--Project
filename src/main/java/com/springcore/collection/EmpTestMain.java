package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTestMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/configforCollection.xml");
		
		Employee Employee1 =(Employee) context.getBean("Employee1");
		
		System.out.println(Employee1.getEmpName());
		System.out.println(Employee1.getPhoneNo());
		System.out.println(Employee1.getAddress());
		System.out.println(Employee1.getCourses());
	}

}
