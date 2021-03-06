package com.csscorp.oops.Polymorphism.Dynamic;

class Bank {
	int getRateOfInterest() {
		return 10;
	}
}

class SBI extends Bank {
	@Override
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	@Override
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	@Override
	int getRateOfInterest() {
		return 9;
	}
}

class TestOverriding {
	public static void main(String args[]) {
		Bank b = new SBI();
		
		
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
	}
}