package com.rental.springapp.helloworld.service;

import java.util.List;

import com.rental.springapp.helloworld.domain.Product;

@SuppressWarnings("serial")
public class SimpleProductManager implements ProductManager {

	public void increasePrice(int percentage) {
		throw new UnsupportedOperationException();	
	}

	public List<Product> getProducts() {
		throw new UnsupportedOperationException();
	}
	
	public void setProduct(List<Product> products) {
		throw new UnsupportedOperationException();
	}
}
