package com.testSH.service;

import java.util.List;

import com.testSH.factory.Product;

public interface ProductService {
	public void addProduct(Product p);
	public void delProduct(String id);
	public void updateProduct(Product p);
	public List queryAllProduct();
	public Product queryProductById(String id);
	
}
