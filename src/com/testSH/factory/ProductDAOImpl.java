package com.testSH.factory;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class ProductDAOImpl implements ProductDao{

	public void save(Product p) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		session.beginTransaction();
		String hql="delelte Product where id=?";
		Query query=session.createQuery(hql);
		query.setString(0,id);
		query.executeUpdate();
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);
	}

	public void update(Product p) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);
		
	}

	public List queryAll() {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		String hql="from product ";
		Query query=session.createQuery(hql);
		List result=query.list();
		HibernateUtil.closeSession(session);
		
		return result;
	}

	public Product queryById(String id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		String hql="from product where id=?";
		Query query=session.createQuery(hql);
		query.setString(0, id);
		List result=query.list();
		Product p=null;
		for (Iterator iterator = result.iterator(); iterator.hasNext();) {
			 p = (Product) iterator.next();
			
		}
		HibernateUtil.closeSession(session);
		
		return p;
	}
	
	
}
