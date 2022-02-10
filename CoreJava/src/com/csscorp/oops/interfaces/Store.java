package com.csscorp.oops.interfaces;

import java.util.Arrays;

public class Store implements StoreServiceProvider{

	private int storeID;
	private String name;
	private String city;
	private Product[] products;
	
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store(int storeID, String name, String city, Product[] products) {
		super();
		this.storeID = storeID;
		this.name = name;
		this.city = city;
		this.products = products;
	}
	@Override
	public String toString() {
		return "Store [storeID=" + storeID + ", name=" + name + ", city=" + city + ", products="
				+ Arrays.toString(products) + "]";
	}
	
	public Product getProduct(int productID) {
		Product foundProduct=null;
		for(Product product:products) {
			if(product.getProductId()==productID) {
				foundProduct=product;
				break;
			}
		}
		return foundProduct;
	}
	@Override
	public double sellProduct(int productID, int qty) {
		double billAmount=0.0;
		Product foundProduct=null;
		for(Product prod:this.products) {
			if(prod.getProductId()==productID) {
				foundProduct=prod;
				break;
			}
		}
		if(foundProduct!=null) {
			if(foundProduct.getQuantityInHand()>=qty) {
				foundProduct.setQuantityInHand(foundProduct.getQuantityInHand()-qty);
				billAmount=foundProduct.getPrice()*qty;
			}
		}
		
		return billAmount;
	}
	@Override
	public boolean updateProduct(int productID, int qty, double price) {
		
		return false;
	}
	@Override
	public boolean purchaseProduct(int productID, int qtyPurchased) {
		
		return false;
	}
	
	
	
}
