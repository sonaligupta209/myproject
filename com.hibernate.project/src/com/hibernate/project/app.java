package com.hibernate.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class app {	
	 public static void main(String[] args) {	
		 SessionFactory factory = new Configuration()				
				 .configure("hibernate.cfg.xml")				
				 .addAnnotatedClass(user.class)				
				 .buildSessionFactory();		
		 Session session = factory.getCurrentSession();				
		 try {			
			 user user = new user(1,"sonali","sona@gmail.com");			
			 user user1= new user(); 			
			 session.beginTransaction();			
			 //user=session.get(user.class,1);			
			 //System.out.println(user);			
			// user=session.get(user.class,1);					
			// user1.setUser_name("Sam1");			
			 session.save(user);			
			 session.getTransaction().commit();			
			 System.out.println("Row added");			
			// System.out.println(user); 	
			 }
		 finally {			
			 session.close();			
			 factory.close();		
			 }		
		 } 
	 
		 }
