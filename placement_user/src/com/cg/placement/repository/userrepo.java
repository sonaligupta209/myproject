package com.cg.placement.repository;

import com.cg.placement.entities.user;



public interface userrepo {
	
	public user addnewuser(user user1) ;
	public user updateuser(user user1);
	void deleteStudent(int id);
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	public void login(user user1);
	public void logout();

}
