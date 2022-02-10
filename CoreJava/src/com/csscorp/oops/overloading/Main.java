package com.csscorp.oops.overloading;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*ArrayList<Trainee> trainees=new ArrayList<>();
		trainees.add(new Trainee(123,"Charles","Male",21));
		trainees.add(new Trainee(124,"Christy","FeMale",20));
		trainees.add(new Trainee(125,"Charles","Male",20));
		*/
		Trainee[] trainees=new Trainee[3];
		trainees[0]=new Trainee(123,"Charles","Male",21);
		trainees[1]=new Trainee(124,"Christy","FeMale",20);
		trainees[2]=new Trainee(125,"Charles","Male",20);
		
		
		BatchArr batch=new BatchArr(10,"JavaBatch",trainees);
		
		System.out.println(Arrays.toString(batch.getTrainees(20)));
		System.out.println(Arrays.toString(batch.getTrainees("Male")));
		

	}

}
