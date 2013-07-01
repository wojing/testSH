package com.testSH.service;

import java.util.List;

import com.testSH.factory.DaoFactory;
import com.testSH.factory.Product;
import com.testSH.factory.ProductDAOImpl;
import com.testSH.factory.ProductDao;

public class ProductServiceImpl implements ProductService{

	public void addProduct(Product p) {
		// 从工厂类
		ProductDao pro=DaoFactory.getDaoInstance();
		if((pro.queryById(p.getId())== null)){
			pro.save(p);
		}else{
			System.out.println("产品"+p.getId()+"已存在"+"\n");
		}
		
	}

	public void delProduct(String id) {
		// TODO Auto-generated method stub
		ProductDao pro=DaoFactory.getDaoInstance();
		if((pro.queryById(id))!= null){
			pro.delete(id);
		}else{
			System.out.println("id已存在\n");
		}
	}

	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		ProductDao pro=DaoFactory.getDaoInstance();
		if(pro.queryById(p.getId())!=null){
			pro.update(p);
		}else{
			System.out.println("id 不存在\n");
		}
	}

	public List queryAllProduct() {
		// TODO Auto-generated method stub
		
		return  DaoFactory.getDaoInstance().queryAll();
	}

	public Product queryProductById(String id) {
		// TODO Auto-generated method stub
		return DaoFactory.getDaoInstance().queryById(id);
	}
	
}
