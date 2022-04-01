package com.cg.placement.service;

import com.cg.placement.entities.user;
import com.cg.placement.repository.userrepoimpl;
import com.cg.placement.repository.userrepo;

public class userserviceimpl implements userservice
{
	// Step 1: Establishing connection between Service and Repo
	private userrepo dao;
	
	public userserviceimpl() 
	{
		dao = new userrepoimpl();
	}
	
	// Step 2: Service calls to perform CRUD Operation



	@Override
	public user addnewuser(user user1) {

		dao.beginTransaction();
		dao.addnewuser(user1);
		dao.commitTrasaction();
		return user1;
	}

	@Override
	public user updateuser(user user1) {
		dao.beginTransaction();
		dao.updateuser(user1);
		dao.commitTrasaction();
		return user1;
	}

	@Override
	public user login(user user1) {
		dao.beginTransaction();
		dao.login(user1);
		dao.commitTrasaction();
		return user1;
	}

	@Override
	public boolean logout() {
		dao.beginTransaction();
		dao.logout();
		dao.commitTrasaction();
		return true;
	}

}
