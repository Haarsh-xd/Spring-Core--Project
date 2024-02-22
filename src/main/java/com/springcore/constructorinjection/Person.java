package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certificate cert;
	private List <String> list;
	public Person(String name,int personId, Certificate cert, List<String>list ) {
		this.name=name;
		this.personId=personId;
		this.cert=cert;
		this.list=list;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + "{"+this.cert.name +"}" + " : " + this.list ;
	}
	
	
}
