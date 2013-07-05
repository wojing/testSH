package com.testSH.action;

import com.opensymphony.xwork2.ActionSupport;
import com.testSH.service.ProductService;
import com.testSH.service.ProductServiceFactory;

public class DeleteAction extends ActionSupport {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String execute() throws Exception{
		ProductService ps=ProductServiceFactory.getServiceInstance();
		ps.delProduct(id);
		return SUCCESS;
	}
}
