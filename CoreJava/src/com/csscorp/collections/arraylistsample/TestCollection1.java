package com.csscorp.collections.arraylistsample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//iterating using Iterator Interface.
class TestCollection1 {
	public static void main(String args[]) {
		
		//Interface				implemnetation class
		List<String> nameList = new ArrayList<String>();// Creating arraylist
		
		nameList.add("Ravi");// Adding object in arraylist
		nameList.add("Vijay");
		nameList.add("Ravi");
		nameList.add("Ajay");
		
		
		// Traversing list through Iterator
		Iterator<String> itr = nameList.iterator();
		//for(int a:{1,2,3,4,5,6})
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}