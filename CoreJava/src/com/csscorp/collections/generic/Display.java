package com.csscorp.collections.generic;

import com.csscorp.oops.interfaces.Product;

public class Display{

	public static <T> void displayArray(T[] arr){
		for(T t: arr){
			System.out.print(t+" ");
		}
	}
	public static <T extends Comparable<T>> T minimum(T obj1,T obj2){
		T result=obj1;
		
		if(obj1.compareTo(obj2)>0)
			result=obj2;
		return result;
	}
	public static void main(String[] ar){
		Integer[] inArray={1,2,3,4,5,6,7};
		Character[] charArray={'j','A','V','A'};
		String[]  stringArray={"Welcome","To","Java","Generics"};
		
		Product[] products=new Product[3];
		products[0]=new Product(123,"Soap",10.00,100);
		products[1]=new Product(124,"biscuit",30.00,50);
		products[2]=new Product(125,"detergent",20.00,65);
		
		System.out.println("Product Array:");
		Display.displayArray(products);
		
		System.out.println("Integer Array:");
		Display.displayArray(inArray);
		System.out.println("Character Array:");
		Display.displayArray(charArray);
		System.out.println("String Array:");
		Display.displayArray(stringArray);

		//System.out.println("\n"+Display.minimum(999931.4,49872.23));

		
	}
}
