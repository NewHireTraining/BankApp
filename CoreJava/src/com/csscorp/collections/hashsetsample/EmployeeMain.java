package com.csscorp.collections.hashsetsample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee(123,"Raj",5);
		Employee emp1=new Employee(124,"Gopi",12);
		Employee emp2=new Employee(123,"Raj",5);
		
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		Set<Employee> employeeSet=new HashSet<>();
		employeeSet.add(emp);
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		
		Iterator<Employee> itr=employeeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
	}

}
