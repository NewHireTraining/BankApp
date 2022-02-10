package com.csscorp.collections.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> nameList=new ArrayList<>();
		nameList.add("Darwin");
		nameList.add("Arun");
		nameList.add("Kumar");
		nameList.add("Charles");
		nameList.add("Arjun");
		
		Collections.sort(nameList);
		
		//1.loops (for/while)
		//2.iterator(list & set)--->forward direction
		//3.Listiterator(list)--->forward & backward
		
		//enhanced for loop
		for(String name:nameList)
			System.out.println(name);
		System.out.println("-----------iterator---------------");
		//iterator hasNext(),next()
		Iterator<String> i=nameList.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		//System.out.println(i.next());
		
		//listIterator hasNext(),next(),hasPrevious(),previous()
		
		ListIterator<String> li=nameList.listIterator();
		System.out.println("-----------List iterator---------------");
		while(li.hasNext()) {
			System.out.println(li.next());
			
		}
		System.out.println("-----------previous---------------");
		if(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		

	}

}
