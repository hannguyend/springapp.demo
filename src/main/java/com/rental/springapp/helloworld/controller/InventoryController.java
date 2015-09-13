package com.rental.springapp.helloworld.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.rental.springapp.helloworld.service.ProductManager;

public class InventoryController implements Controller {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	private ProductManager productManager;

	public ProductManager getProductManager() {
		return productManager;
	}

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String now = (new java.util.Date()).toString();
		logger.info("returning hello view with " + now);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("products", this.productManager.getProducts());
		return new ModelAndView("inventory" , "model", myModel);
	}
	
	public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

}
