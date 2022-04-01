package com.cg.placement.service;


import com.cg.placement.entities.user;

public interface userservice 
{
public user addnewuser(user user1);  
public user updateuser(user user1);  

public user login(user user1);

public boolean logout();

}
