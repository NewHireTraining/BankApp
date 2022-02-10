package com.csscorp.basics;


import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// single line comment
		/*
		 * multi
		 * line
		 * comment
		 */
		//int arr[10];  //in other programming languages like C, C++
		
		//int[] arr;  // array declaration
		//arr=new int[10];  // allocating memory for an array
		
		int[] arr=new int[5];
		arr[0]=3242;
		arr[1]=13242;
		arr[2]=153;
		arr[3]=1124;
		arr[4]=15;
		
		
		int[] ar= {30,20,30,40,30};
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==30) {
				System.out.println("The Element 30 is found at "+i);
			}
		}
		System.out.println("-------------------------");
		int i=0;
		for(int data:ar) {
			if(data==30) {
				System.out.println("The elmenet 30 is found at "+i);
			}
			i++;
		}
		
		
		/*
		System.out.println(arr[0]);
		System.out.println(ar[4]);
		System.out.println("--------------------------");
		int i;
		for(i=0;i<5;i++) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------------------");
		//enhanced for loop 
		for(int element:ar) {
			System.out.println(element);
		}
		
		//int id;
		//find whether the array ar contains a value 30 or not.
		boolean foundFlag=false;
		for(int element:ar) {
			if(element==300) {
				foundFlag=true;
			}
		}//end of for loop
		
		if(foundFlag) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
	System.out.println(ar.length);
	System.out.println("-------------------------");
	Arrays.sort(arr);
	
	for(int ele:arr) {
		System.out.println(ele);
	}
		*/
	}
}
