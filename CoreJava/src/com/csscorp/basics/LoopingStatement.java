package com.csscorp.basics;

public class LoopingStatement {

	public static void main(String[] args) {
				
		//int data[]= {1,2,4};
		int[] data=new int[3];
		data[0]=10;
		data[1]=30;
		data[2]=20;
		//initialization;condition; incre/decre
		for(int a=0;a<data.length;a++) {
			System.out.println(data[a]);
		}
		System.out.println("=====================");
		//datatype var:collection
		for(int A:data) {
			System.out.println(A);
		}

	}

}
