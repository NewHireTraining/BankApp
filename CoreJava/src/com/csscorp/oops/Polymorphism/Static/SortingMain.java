package com.csscorp.oops.Polymorphism.Static;

public class SortingMain {

	public static void main(String[] args) {
		Sorting sort=new Sorting();
		
		int[] arr= {3,5,2,6,1,7};
		for(int data:sort.sortArray(arr)) {
			System.out.println(data);
		}
		
		System.out.println("=============");
		for(int data:sort.sortArray(arr,false)) {
			System.out.println(data);
		}
	}

}
