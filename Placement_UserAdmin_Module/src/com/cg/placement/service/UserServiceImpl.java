package com.cg.placement.service;

import com.cg.placement.entities.User;
import com.cg.placement.repository.IUserRepository;
import com.cg.placement.repository.UserRepositoryImpl;


public class UserServiceImpl implements IUserService{

	private IUserRepository dao;
	
	public UserServiceImpl() 
	{
		dao = new UserRepositoryImpl();
	}
	@Override
	public User addnewUser(User user) {
		dao.beginTransaction();
		dao.addnewUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User login(User user) {
		dao.beginTransaction();
		dao.login(user);
		dao.commitTrasaction();
		return user;
	
	}

	@Override
	public boolean logout() {
		dao.beginTransaction();
		dao.logout();
		dao.commitTrasaction();
		return true;
	}

}
