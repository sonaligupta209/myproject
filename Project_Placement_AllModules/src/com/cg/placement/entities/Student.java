package com.cg.placement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "student")

public class Student {
		
		@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Student_id;
		private String name;
		private int roll;
		private String qualification;
		private String course;
		private int year;
		
		@OneToOne(cascade=CascadeType.ALL)  //mapping with certificate 1:1
		@JoinColumn(name="certificate_id")
		private Certificate certificate;
		
		/*@ManyToOne							//mapping with college M:1
		@JoinColumn(name = "c_id")
		private College college;*/
		
		private int hallTicketNo;

		public int getId() {
			return Student_id;
		}

		public void setId(int id) {
			this.Student_id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public Certificate getCertificate() {
			return certificate;
		}

		public void setCertificate(Certificate certificate) {
			this.certificate = certificate;
		}

		public int getHallTicketNo() {
			return hallTicketNo;
		}

		public void setHallTicketNo(int hallTicketNo) {
			this.hallTicketNo = hallTicketNo;
		}

	/*	public College getCollege() {
			return college;
		}

		public void setCollege(College college) {
			this.college = college;
		}*/

}