package com.seclore.pojo;

import com.seclore.exceptions.InvalidProductPriceException;

public class Product {
	private int productId;
	private String name;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String name, double price) throws InvalidProductPriceException {
		super();
		this.productId = productId;
		this.name = name;
		if (price <= 0) {
			throw new InvalidProductPriceException();
		}
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws InvalidProductPriceException {
		if (price <= 0)
			throw new InvalidProductPriceException();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}

}
