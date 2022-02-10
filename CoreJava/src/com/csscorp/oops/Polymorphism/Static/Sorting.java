package com.csscorp.oops.Polymorphism.Static;

import java.util.Arrays;

public class Sorting {

	public int[] sortArray(int[] intArray) {
		int[] sortedArray = new int[intArray.length];
		Arrays.sort(intArray);
		sortedArray = intArray;
		return sortedArray;
	}

	public int[] sortArray(int[] intArray, boolean decending) {
		int[] sortedArray = new int[intArray.length];
		Arrays.sort(intArray);
		if (decending==true) {
			int j = 0;
			for (int i = intArray.length - 1; i >= 0; i--) {
				sortedArray[j] = intArray[i];
				j++;
			}
		}else {
			sortedArray=intArray;
		}
		return sortedArray;
	}

}
