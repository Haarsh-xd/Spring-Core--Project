package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String empName;
	private List<String> phoneNo;
	private Set<String> address;
	private Map<String, String> courses;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(String empName, List<String> phoneNo, Set<String> address, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phoneNo=" + phoneNo + ", address=" + address + ", courses=" + courses
				+ "]";
	}
	
	
	
}
