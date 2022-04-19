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
@Table(name = "certificate")

public class Certificate {

		
		@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int certificat_id;
		private int year;
		
		@ManyToOne								// mapping with college M:1
		@JoinColumn(name="c_id")
		private College college;
		
		@OneToOne(mappedBy="certificate")		// mapping with certificate 1:1
		private Student student;
		
		
		public int getId() {
			return certificat_id;
		}

		public void setId(int id) {
			this.certificat_id = id;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public College getCollege() {
			return college;
		}

		public void setCollege(College college) {
			this.college = college;
		}
}
