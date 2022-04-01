
package com.cg.placement.client;

import com.cg.placement.entities.user;
import com.cg.placement.service.userservice;
import com.cg.placement.service.userserviceimpl;

public class client 
{
	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		user user1 = new user();
		
		userservice service = new userserviceimpl();
	
		user1.setId(102);
		user1.setName("Dhoni");
		user1.setType("teacher");
		user1.setPassword("MS");
		
	    
		// Retrieve
		/*
		student	= service.searchStudentById(100);
		System.out.println("ID is:"+student.getId());
		System.out.println("Roll is:"+student.getRoll());
		System.out.println("College is:"+student.getCollege());
		
		
		*/
		  
		//
		/*
		// Update
		student	= service.searchStudentById(100);
		student.setCollege("Mumbai University");
		service.updateStudent(student);
		System.out.println("Update is successful");
		*/
		
		
		//student	= service.searchStudentById(101);
	//	service.deleteStudent(student);
		//System.out.println("Delete is successful");
		
		
	////	student	= service.searchStudentByHallTicket(111);
	///	service.deleteStudent(student);
	//	System.out.println("Delete is successful");
		
		
		
	}

}

