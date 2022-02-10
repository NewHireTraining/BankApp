package com.csscorp.basics;

public class CarMain {
	public static void main(String[] args) {
		
		
		
		Car myCar=new Car("Blue","someModel","somebrand",20,4);
		Car sportsCar=new Car();
		Car sportsCar1=new Car();
		Car sportsCar2=new Car();
		Car sportsCar3=new Car();
		
		
		System.out.println(Car.displayCounter());
		/*sportsCar.setColor("Red");
		sportsCar.setSpeedInKM(2000);
		sportsCar.setNoOfSeats(2);
		
		System.out.println(myCar.getBrand());
		System.out.println(myCar.getSpeedInKM());
		
		System.out.println(sportsCar);*/
	}

}
