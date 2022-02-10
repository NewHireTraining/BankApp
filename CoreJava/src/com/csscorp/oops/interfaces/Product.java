package com.csscorp.oops.interfaces;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private double quantityInHand;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantityInHand() {
		return quantityInHand;
	}
	public void setQuantityInHand(double quantityInHand) {
		this.quantityInHand = quantityInHand;
	}
	public Product(int productId, String productName, double price, double quantityInHand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityInHand = quantityInHand;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantityInHand=" + quantityInHand + "]";
	}
	
	

}
