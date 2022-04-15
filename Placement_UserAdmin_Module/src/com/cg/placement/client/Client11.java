package com.cg.placement.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;

import com.cg.placement.service.IUserService;
import com.cg.placement.service.UserServiceImpl;
public class Client11 {

	public static void main(String[] args) {
		
		
	
		// TODO Auto-generated method 
		User user = new User();
		
		IUserService service = new UserServiceImpl();
		//user.setId(2);
		user.setName("sonali");
		user.setType("principal");
		user.setPassword("sonali");
		service.addnewUser(user);
		
		Admin admin = new Admin();
		//user.setId(2);
		user.setName("sonali");
		user.setPassword("sonali123");
		
		
		
		System.out.println("ID is:"+user.getId());
		System.out.println("Name is:"+user.getName());
		
	}

}
