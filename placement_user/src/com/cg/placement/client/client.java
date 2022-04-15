package com.cg.placement.client;
import com.cg.placement.entities.user;
import com.cg.placement.repository.userrepo;
import com.cg.placement.service.userservice;
import com.cg.placement.service.userserviceimpl;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		user user = new user();
		
		userservice service = new userserviceimpl();
		user.setId(1);
		user.setName("Vaishu");
		user.setType("teacher");
		user.setPassword("tyyui");
		service.addnewuser(user);
		
	
		System.out.println("ID is:"+user.getId());
		System.out.println("Name is:"+user.getName());
		
	}

}

