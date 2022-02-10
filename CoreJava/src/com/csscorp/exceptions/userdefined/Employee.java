package com.csscorp.exceptions.userdefined;

public class Employee {
	private int personID;
	private String name;
	private int exp;
	
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int personID, String name, int exp) {
		super();
		this.personID = personID;
		this.name = name;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "ElectionList [personID=" + personID + ", name=" + name + ", exp=" + exp + "]";
	}
	
	
}
