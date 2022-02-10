package com.csscorp.oops.inheritance.simple;

public class Lenovo extends Laptop{
	private String proccessor;

	public Lenovo(String proccessor) {
		super();
		this.proccessor = proccessor;
	}

	public Lenovo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lenovo(double price, String model, String proccessor) {
		super(price, model);  //super class constructor
		this.proccessor=proccessor;
	}
	
	public String getProccessor() {
		return proccessor;
	}

	public void setProccessor(String proccessor) {
		this.proccessor = proccessor;
	}

	public void getLenovoDetails(){
		System.out.println("Proccessor: "+getProccessor());
		getDetails();  // method from super class
	}

}
