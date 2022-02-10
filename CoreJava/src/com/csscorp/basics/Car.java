package com.csscorp.basics;

//POJO class
public class Car {
	// state defines the object
	private String color;
	private String model;
	private String brand;
	private int speedInKM;
	private int noOfSeats;
	public static int objCounter;
	static {
		objCounter=0;
	}
	
	// constructor

	public Car() {
		objCounter++;
	}
	public static int displayCounter() {
		return objCounter;
	}
	
	public Car(String color, String model, String brand, int speedInKM, int noOfSeats) {
		super();
		objCounter++;
		this.color = color;
		this.model = model;
		this.brand = brand;
		this.speedInKM = speedInKM;
		this.noOfSeats = noOfSeats;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpeedInKM() {
		return speedInKM;
	}

	public void setSpeedInKM(int speedInKM) {
		this.speedInKM = speedInKM;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	// behavior
	public void drive(int speed) {

	}

	public boolean changeGear(int noOfGear) {
		boolean gearChangeFlag = false;

		return gearChangeFlag;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", brand=" + brand + ", speedInKM=" + speedInKM
				+ ", noOfSeats=" + noOfSeats + "]";
	}

}
