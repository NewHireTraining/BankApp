package com.csscorp.oops.interfaces;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Product[] products=new Product[3];
		products[0]=new Product(123,"Soap",10.00,100);
		products[1]=new Product(124,"biscuit",30.00,50);
		products[2]=new Product(125,"detergent",20.00,65);
		
		
		Store myStore=new Store(100,"MyStore","Chennai",products);
		double billValue=myStore.sellProduct(124, 3);
		System.out.println("Quantity In Hand: "+myStore.getProduct(124).getQuantityInHand());
		System.out.println("BillValue: "+billValue);
		
		System.out.println(Arrays.toString(myStore.getProducts()));
		
				
	}

}
