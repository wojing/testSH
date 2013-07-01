package com.testSH.factory;

public class DaoFactory {
	public static ProductDao getDaoInstance(){
		return new ProductDAOImpl();
	}
}
