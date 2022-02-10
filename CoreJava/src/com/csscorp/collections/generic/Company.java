package com.csscorp.collections.generic;

import java.util.HashMap;
import java.util.HashSet;

public class Company {

	private int companyid;
	private String name;
	private String location;
	
	//private Employee[] employee=new Employee[1000];
	private HashSet<Employee> employees;
	private HashMap<Integer,Employee> employeesMap;
	
	public void recruitEmployee(Employee newEmp) {
		this.employees.add(newEmp);
		this.employeesMap.put(newEmp.getEmpid(), newEmp);
	}
	
	
	public Employee getEmployeeDetails(int empid) {
		Employee foundEmployee=null;
		for(Employee emp:employees) {
			if(emp.getEmpid()==empid) {
				foundEmployee=emp;
				break;
			}
		}
		//return foundEmployee;
		return this.employeesMap.get(empid);
	}
	
	
}
