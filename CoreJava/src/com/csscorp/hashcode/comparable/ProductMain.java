package com.csscorp.hashcode.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {

	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(123,"Soap",LocalDate.now().plusMonths(4),20.5));
		products.add(new Product(453,"cookies",LocalDate.now().plusMonths(2),50.00));
		products.add(new Product(1,"chocolate",LocalDate.now().plusMonths(3),200.5));
		products.add(new Product(26,"shampoo",LocalDate.now().plusMonths(6),40.5));
		
		for(Product prod:products) {
			System.out.println(prod);
		}
		Collections.sort(products);
		System.out.println("After Sorting...");
		for(Product prod:products) {
			System.out.println(prod);
		}
	}
}
