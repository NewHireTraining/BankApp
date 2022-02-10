package com.csscorp.basics;

public class FunctionDemo {

	// method definition
	void displayIntegerArray(int[] data) {
		for (int value : data) {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		int[] empID = { 1, 2, 3, 4, 5 };
		int[] empExp = { 2, 4, 6, 10, 15 };
		String[] nameList = { "Raj", "Arun", "John", "Charles", "Rose" };

		FunctionDemo fd = new FunctionDemo();
		// method invocation
		fd.displayIntegerArray(empID);
		fd.displayIntegerArray(empExp);

		for (String name : nameList) {
			System.out.println(name);
		}

	}
}
