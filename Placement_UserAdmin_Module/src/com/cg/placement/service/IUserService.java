package com.cg.placement.service;

import com.cg.placement.entities.User;

public interface IUserService {
	public User addnewUser(User user);  
	public User updateUser(User user);  

	public User login(User user);

	public boolean logout();
}
