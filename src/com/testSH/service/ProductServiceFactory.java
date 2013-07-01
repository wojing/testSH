package com.testSH.service;

public class ProductServiceFactory {
	public static ProductServiceImpl getServiceInstance(){
		return new ProductServiceImpl();
	}
}
