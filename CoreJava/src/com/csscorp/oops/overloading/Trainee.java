package com.csscorp.oops.overloading;


public class Trainee {

	private int traineeID;
	private String traineeName;
	private String gender;
	private int age;
	
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Trainee(int traineeID, String traineeName, String gender, int age) {
		super();
		this.traineeID = traineeID;
		this.traineeName = traineeName;
		this.gender = gender;
		this.age = age;
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trainee [traineeID=" + traineeID + ", traineeName=" + traineeName + ", gender=" + gender + ", age="
				+ age + "]";
	}
	
	
	
	
}
