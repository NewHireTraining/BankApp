package com.csscorp.exceptions.userdefined;

public class Main {

	public void validate(Employee emp) throws InsufficientExperienceException{
		if (emp.getExp() >= 20) {
			System.out.println("eligible");
		} else {
			throw new InsufficientExperienceException();
		}

	}

	public static void main(String[] args) {
		Employee emp = new Employee(123, "Raj", 20);
		Employee emp1 = new Employee(124, "Rajesh", 10);
		Employee emp2 = new Employee(126, "Raji", 30);

		try {
			new Main().validate(emp1);
		}catch(InsufficientExperienceException exp) {
			System.out.println(exp.getMessage());
		}
		
	}

}
