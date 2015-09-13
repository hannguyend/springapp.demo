package com.rental.springapp.helloworld.service;

import java.util.List;

import com.rental.springapp.helloworld.domain.Product;

@SuppressWarnings("serial")
public class SimpleProductManager implements ProductManager {
	
	private List<Product> products;
	
	public void increasePrice(int percentage) {
		if (products != null) {
			for (Product product : products) {
				double newPrice = product.getPrice().doubleValue() * (100 + percentage)/100;
				product.setPrice(newPrice);
			}
		}
	}

	public List<Product> getProducts() {
		return this.products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
