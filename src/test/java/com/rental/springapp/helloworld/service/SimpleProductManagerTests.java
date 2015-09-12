package com.rental.springapp.helloworld.service;

import junit.framework.TestCase;

public class SimpleProductManagerTests extends TestCase {
	
	private SimpleProductManager productManager;
	
	protected void setUp() throws Exception {
		productManager = new SimpleProductManager();
	}
	
	public void testGetProductsWithNoProducts() {
		productManager = new SimpleProductManager();
		assertNull(productManager.getProducts());
	}
}
