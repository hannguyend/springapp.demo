package com.rental.springapp.helloworld.service;

import java.io.Serializable;
import java.util.List;

import com.rental.springapp.helloworld.domain.Product;

public interface ProductManager extends Serializable {
	
	public void increasePrice(int percentage);
	
	public List<Product> getProducts();
	
}
