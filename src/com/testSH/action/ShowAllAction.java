package com.testSH.action;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.testSH.service.ProductService;
import com.testSH.service.ProductServiceFactory;

public class ShowAllAction extends ActionSupport {
	public String execute() throws Exception{
		ProductService ps= ProductServiceFactory.getServiceInstance();
		List all=ps.queryAllProduct();
		//将all存储在request范围中
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
		
	}
	
}
