package com.springcore.referencetypeinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {
	public static void main(String[] args) {
		
		System.out.println( "***P R O J E C T S T A R T E D*** :-)" );
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/referencetypeinjection/referenceinjectionconfig.xml");
		A obj=(A)context.getBean("aref");
		System.out.println(obj.getX());
		System.out.println(obj.getOb().getY());
		System.out.println(obj);
}
}
