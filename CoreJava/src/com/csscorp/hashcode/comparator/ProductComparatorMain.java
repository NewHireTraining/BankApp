package com.csscorp.hashcode.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.csscorp.hashcode.comparable.Product;

public class ProductComparatorMain {

	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<Product>(); 
		products.add(new Product(123,"Soap",LocalDate.now().plusMonths(4),20.5));
		products.add(new Product(453,"Biscuits",LocalDate.now().plusMonths(2),50.00));
		products.add(new Product(1,"Chocolate",LocalDate.now().plusMonths(3),200.5));
		products.add(new Product(26,"Oil",LocalDate.now().plusMonths(6),40.5));
		
		for(Product prod:products) {
			System.out.println(prod);
		}
		//Collections.sort(products,new ProductNameComparator());
		Collections.sort(products,new Comparator<Product>() {
			@Override
			public int compare(Product prod1,Product prod2) {
				return prod1.getExpDate().compareTo(prod2.getExpDate());
			}
		});
		System.out.println("After Sorting...");
		for(Product prod:products) {
			System.out.println(prod);
		}
	}
}
