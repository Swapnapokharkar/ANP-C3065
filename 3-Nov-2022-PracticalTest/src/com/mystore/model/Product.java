package com.mystore.model;

public class Product {
	int productId;
	String productName;
	double productPrice;
	public Product(){	
}
	

public Product(int pId,String pName, double pprice) {
	productId=pId;
	productName=pName;
	productPrice=pprice;
}

public Product(int pId) {
	productId=pId;
}
public Product(String pName) {
	productName=pName;
}
public Product(double pprice) {
	productPrice=pprice;
}


public void setProductId(int pId) {
	       productId=pId;
	         }
public int getProductId() {
    return productId;
    }
public void setProductName(String pName) {
	       productName=pName;
	       
}

	public String getProductName() {
	       return  productName;
	    }
	public void setProductPrice(double pprice ) {
		productPrice=pprice;
	    }
	public double getProductPrice() {
	       return productPrice;
	    }
	
	}


