package com.csscorp.hashcode.comparable;

import java.time.LocalDate;

public class Product implements Comparable<Product>{
	private int productCode;
	private String productName;
	private LocalDate expDate;
	private double price;
	
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int productCode, String productName, LocalDate expDate, double price) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.expDate = expDate;
		this.price = price;
	}
	public Product() {
		super();
		
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", expDate=" + expDate
				+ ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product o) {
		/*int compareResult=0;
		if(this.productCode>o.productCode) {
			compareResult=1;
		}else if(this.productCode<o.productCode) {
			compareResult=-1;
		}
		return compareResult;*/
		return this.productCode-o.productCode;
	}
	
	
	
}
