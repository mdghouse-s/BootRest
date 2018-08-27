package com.pro.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {

	private int productCode;
	private String productName;
	private double price;
	private String category;
	
	public Product(){}
	
	public Product(int productCode, String productName, double price, String category) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
