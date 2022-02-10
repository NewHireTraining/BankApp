package com.csscorp.oops.inheritance.simple;



import java.util.Date;

public class SoftwareMain {

	public static void main(String[] args) {
		LicensedSoftware licensedSoftware=new LicensedSoftware("test Application","test","Web Application",1000000000,500.00,"abc-abc-abc","Mukesh","test",new Date("02/03/2017"),new Date("02/03/2018"));
		
		System.out.println(licensedSoftware.toString());
		
		
	}
}
