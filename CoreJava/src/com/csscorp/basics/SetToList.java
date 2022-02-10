package com.csscorp.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		Set<String> namelist=new HashSet<String>();
		namelist.add("Thangaraj");
		namelist.add("Raj");
		namelist.add("John");
		namelist.add("Gopi");
		namelist.add("Bala");
		
		
		System.out.println(namelist);
		
		List<String> names=new ArrayList<String>();
		names.addAll(namelist);
		System.out.println(names);
		
		
	

	}

}
