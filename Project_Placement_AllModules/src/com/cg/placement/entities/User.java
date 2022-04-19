package com.cg.placement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

		@Id
		private int u_id;
		private String name;
		private String Types;
		private String passwords;
		
		//@OneToOne(mappedBy="user")
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="A_id")
		private Admin admin;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="c_id")
		private College college;
		
		
		public int getId() {
			return u_id;
		}
		public void setId(int id) {
			this.u_id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return Types;
		}
		public void setType(String type) {
			this.Types = type;
		}
		public String getPassword() {
			return passwords;
		}
		public void setPassword(String password) {
			this.passwords = password;
		}
		public Admin getAdmin() {
			return admin;
		}
		public void setAdmin(Admin admin) {
			this.admin = admin;
		}
		public College getCollege() {
			return college;
		}
		public void setCollege(College college) {
			this.college = college;
		}


}
