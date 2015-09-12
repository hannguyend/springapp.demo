package com.rental.springapp.helloworld.domain;

import junit.framework.TestCase;

public class ProductTests extends TestCase {
	
	private Product product;
	
	public void setUp() throws Exception {
		product = new Product();
	}
	
	public void testSetAndGetDescription() {
		String description = "some decription in here";
		assertNull(product.getDescription());
		product. setDescription(description);
		assertEquals(product.getDescription(), description);
	}
	
	public void testSetAndGetPrice() {
		double testPrice = 34d;
		assertNull(product.getPrice());
		product.setPrice(testPrice);
		assertEquals(product.getPrice(), testPrice, 0);
	}	
}