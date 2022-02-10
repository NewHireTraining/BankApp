package com.csscorp.basics;

public class ProgramStructure {
	String name = "Gopi";
	int exp = 11;
	double salary = 1000;
	boolean billableStatus = false;

	public ProgramStructure() {
		// default constructor
	}

	public static void main(String[] var) {
		ProgramStructure ps = new ProgramStructure();
		System.out.println(ps.name);
		System.out.println(ps.exp);
		System.out.println(ps.salary);
		System.out.println(ps.billableStatus);

		if (ps.exp > 10) {
			// block
			System.out.println("Salary: " + ps.salary);
		}

		// if(ps.billableStatus==true)
		if (ps.billableStatus) {
			System.out.println("Employee is a billable resource");
		} else {
			System.out.println("Employee is a bench resource");
		}

		if (ps.exp > 10) {
			if (ps.salary < 50000) {
				System.out.println("Senior Employee, eligible for promotion");
			}
		}
		//if() {}else if() {} else if() {}

	}
}
