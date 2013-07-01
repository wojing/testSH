package com.testSH.factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static SessionFactory factory;
	static{
		Configuration cfg=new Configuration().configure();
		factory=cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory(){
		return factory;
	}
	
	public static Session getSession(){
		return factory.openSession();
	}
	
	public static void closeSession(Session session){
		if(session != null){
			if(session.isOpen()){
				session.close();
			}
				
		}
	}
}
