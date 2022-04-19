package com.cg.placement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
		@Id
		private int A_id;
		private String name;
		private String passwords;
		
		@OneToOne(mappedBy="admin")
		//@OneToOne(cascade=CascadeType.ALL)
		//@JoinColumn(name="u_id")
		private User user;
		public int getId() {
			return A_id;
		}
		public void setId(int id) {
			this.A_id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return passwords;
		}
		public void setPassword(String password) {
			this.passwords = password;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}

}
