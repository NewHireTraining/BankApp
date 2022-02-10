package com.csscorp.oops.overloading;

import java.util.Arrays;

public class BatchArr {
	private int batchId;
	private String name;
	private Trainee[] trainees;

	// Method Overloading
	public Trainee[] getTrainees(String gender) {
		Trainee[] foundTrainees = new Trainee[3];
		int i=0;
		for(Trainee trainee:trainees) {
			String gen=trainee.getGender();
			if(gen.equals(gender)) {
				foundTrainees[i]=trainee;
				i++;
			}
		}
		return foundTrainees;
	}

	public Trainee[] getTrainees(int age) {
		Trainee[] foundTrainees = new Trainee[3];
		int i=0;
		for(Trainee trainee:trainees) {
			int traineeAge=trainee.getAge();
			if(traineeAge==age) {
				foundTrainees[i]=trainee;
				i++;
			}
		}
		return foundTrainees;

	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public Trainee[] getTrainees() {
		return trainees;
	}

	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BatchArr(int batchId, String name, Trainee[] trainees) {
		super();
		this.batchId = batchId;
		this.name = name;
		this.trainees = trainees;
	}

	public BatchArr() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BatchArr [batchId=" + batchId + ", name=" + name + ", trainees=" + Arrays.toString(trainees) + "]";
	}

}
