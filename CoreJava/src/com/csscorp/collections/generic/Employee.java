package com.csscorp.collections.generic;

public class Employee {

	private int empid;
	private String name;
	private int age;
	private String phone;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Employee(int empid, String name, int age, String phone) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
}
