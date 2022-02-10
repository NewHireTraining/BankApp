package com.csscorp.oops.encapsulation;

public class Main {
	public static void main(String[] args) {

		Person personObj=new Person();
		personObj.setAddress("Chennai");
		
		System.out.println(personObj.getAge());
		System.out.println(personObj.getAddress());
		
		Person personObj1=new Person("Darwin",20,"34324123","chennai","Darwin@gmail.com");
		System.out.println(personObj1.getAge());
		System.out.println(personObj1.getAddress());
		
		System.out.println(personObj1.toString());
		
		
		/*
		EncapsulationDemo encapsulation=new EncapsulationDemo(1,19,"Java batch");
		
//		encapsulation.setDay(1);
//		encapsulation.setBatchName("Java Batch");
//		encapsulation.setNoOfTrainees(19);
		
    
		System.out.println("Day: "+encapsulation.getDay());
		System.out.println(encapsulation.getBatchName());
		System.out.println(encapsulation.getNoOfTrainees());*/
	}
}
