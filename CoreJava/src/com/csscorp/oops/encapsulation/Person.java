package com.csscorp.oops.encapsulation;

public class Person {

	//state
	private String name;
	private int age;
	private String phone;
	private String address;
	private String email;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person(String name, int age, String phone, String address, String email) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + ", email="
				+ email + "]";
	}
	
	
	
}
