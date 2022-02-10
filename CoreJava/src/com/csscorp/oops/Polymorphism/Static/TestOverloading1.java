package com.csscorp.oops.Polymorphism.Static;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b, double c) {
		return a + b + c;
	}
}

class TestOverloading1 {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
	}
}