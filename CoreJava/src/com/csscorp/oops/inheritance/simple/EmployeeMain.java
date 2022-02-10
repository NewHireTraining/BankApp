package com.csscorp.oops.inheritance.simple;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		Person personObj=new Person("Charles",20,"12312312","email@gmail.com","Chennai");
		
		System.out.println(personObj.toString());
		
		Employee emp=new Employee("Charles",20,"12312312","email@gmail.com","Chennai",123,10,"CSS","L & D","Trainer");
		
		
		System.out.println(emp.toString());
		
		
		/*personObj.display();
		System.out.println("============");
		emp.display();*/
		
		
	}

}
