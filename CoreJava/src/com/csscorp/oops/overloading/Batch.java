package com.csscorp.oops.overloading;

import java.util.ArrayList;

public class Batch {

	private int batchID;
	private String batchName;
	//private Trainee[] trainees;
	private ArrayList<Trainee> trainees=new ArrayList<>();
	
	public int getBatchID() {
		return batchID;
	}
	public void setBatchID(int batchID) {
		this.batchID = batchID;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public ArrayList<Trainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(ArrayList<Trainee> trainees) {
		this.trainees = trainees;
	}
	public Batch(int batchID, String batchName, ArrayList<Trainee> trainees) {
		super();
		this.batchID = batchID;
		this.batchName = batchName;
		this.trainees = trainees;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trainee getTrainee(int traineeID) {
		Trainee foundTrainee=null;
		for(Trainee trainee:trainees) {
			if(trainee.getTraineeID()==traineeID) {
				foundTrainee=trainee;
			}
		}
		return foundTrainee;
	}
	public ArrayList<Trainee> getTrainees(String gender){
		ArrayList<Trainee> foundTrainees=new ArrayList<Trainee>();
		for(Trainee trainee:trainees) 
			if(trainee.getGender().equals(gender))
				foundTrainees.add(trainee);
		
		return foundTrainees;
	}
	
	public ArrayList<Trainee> getTrainees(int age){
		ArrayList<Trainee> foundTrainees=new ArrayList<Trainee>();
		for(Trainee trainee:trainees) 
			if(trainee.getAge()==age)
				foundTrainees.add(trainee);
		
		return foundTrainees;
	}
}
