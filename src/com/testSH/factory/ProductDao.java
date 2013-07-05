package com.testSH.factory;
import java.util.List;



public interface  ProductDao {
	public void save(Product p);
	public void delete(String id);
	public void update(Product p);
	public List queryAll();
	public Product queryById(String id);
}
