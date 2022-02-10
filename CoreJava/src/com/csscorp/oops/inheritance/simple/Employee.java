package com.csscorp.oops.inheritance.simple;

public class Employee extends Person{

	
	private int empID;
	private int exp;
	private String company;
	private String department;
	private String designation;
	
		
	@Override
	public void display() {
		// TODO Auto-generated method stub
		//super.display();
		System.out.println("empID: "+this.empID+"\nName: "+this.getName()+"\nPhone: "+this.getPhone());
	}
	public Employee(String name, int age, String phone, String email, String address, int empID, int exp,
			String company, String department, String designation) {
		super(name, age, phone, email, address);
		this.empID = empID;
		this.exp = exp;
		this.company = company;
		this.department = department;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String phone, String email, String address) {
		super(name, age, phone, email, address);
		// TODO Auto-generated constructor stub
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", exp=" + exp + ", company=" + company + ", department=" + department
				+ ", designation=" + designation + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
