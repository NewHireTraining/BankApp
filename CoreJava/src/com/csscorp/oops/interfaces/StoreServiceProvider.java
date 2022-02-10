package com.csscorp.oops.interfaces;

public interface StoreServiceProvider {
	public double sellProduct(int productID,int qty);
	public boolean updateProduct(int productID,int qty,double price);
	public boolean purchaseProduct(int productID,int qtyPurchased);
}
