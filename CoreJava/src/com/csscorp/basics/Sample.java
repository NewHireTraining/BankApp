package com.csscorp.basics;

public class Sample {

	public String greeting(String userName){
		String greeting=new String();
		//logic
		greeting="Welcome ".concat(userName);
		return greeting;
	}
	
	public static void main(String[] args) {
		
		Sample obj=new Sample();
		
		System.out.println(obj.greeting("Varun"));
	}
	
}
