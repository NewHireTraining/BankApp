package com.csscorp.hashcode.comparator;

import java.util.Comparator;

import com.csscorp.hashcode.comparable.Product;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product prod1, Product prod2) {
		
		return prod1.getProductName().compareTo(prod2.getProductName());
	}

}
