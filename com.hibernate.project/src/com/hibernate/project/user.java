package com.hibernate.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity@Table(name="user")
public class user 
{	public user() {			}
public user(int user_id, String user_name, String user_email) {	
	 super();
	 this.user_id = user_id;		
	 this.user_name = user_name;
	 this.user_email = user_email;	
	 } 	
@Id	
@Column(name="user_id")	
int user_id; 	
@Column(name="user_name")
String user_name; 
@Column(name="user_email")	
String user_email; 	
public int getUser_id()
{		return user_id;
} 	
public void setUser_id(int user_id)
{		this.user_id = user_id;	} 
public String getUser_name() {	
	 return user_name;	} 
public void setUser_name(String user_name) {	
	 this.user_name = user_name;	
	 } 	public String getUser_email() {	
		 return user_email;	} 
	 public void setUser_email(String user_email) {		
		 this.user_email = user_email;	
		 } 	@Override	
	 public String toString() {		
			 
			return "user [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email + "]";	}
}
