package com.cg.placement.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {

	@Id
	private int c_id;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	
	@OneToOne(mappedBy="college")   								 //association with user 1:1
	private User user;
	
	@OneToMany(mappedBy="college",cascade=CascadeType.PERSIST)    // association with placement 1:M
	private List<Placement> placement;

	@OneToMany(mappedBy="college",cascade=CascadeType.PERSIST)		// association student 1:M
	private List<Student> student;
	
	@OneToMany(mappedBy="college",cascade=CascadeType.PERSIST)		// association with certificate 1:M
	private List<Certificate> certificate;
	
	public int getId() {
		return c_id;
	}

	public void setId(int id) {
		this.c_id = id;
	}

	public String getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(List<Certificate> certificate) {
		this.certificate = certificate;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Placement> getPlacement() {
		return placement;
	}

	public void setPlacement(List<Placement> placement) {
		this.placement = placement;
	}
	
	
}