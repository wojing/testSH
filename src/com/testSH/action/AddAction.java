package com.testSH.action;

import com.opensymphony.xwork2.ActionSupport;
import com.testSH.factory.Product;
import com.testSH.service.ProductService;
import com.testSH.service.ProductServiceFactory;

public class AddAction extends ActionSupport{
	private String id;
	private String name;
	private double price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String execute() throws Exception{
		Product p=new Product();
		ProductService ps=ProductServiceFactory.getServiceInstance();
		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		ps.addProduct(p);
		return SUCCESS;
		
	}
}
