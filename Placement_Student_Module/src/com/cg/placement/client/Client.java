package com.cg.placement.client;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;
import com.cg.placement.service.CertificateServiceImpl;
import com.cg.placement.service.ICertificateService;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		
		
		
		
		
		ICertificateService cservice = new CertificateServiceImpl();
		
		//ADD-DATA-STUDENT
		Student student = new Student();
		
		student.setName("Dhoni");
		student.setRoll(49);
		student.setQualification("MS");
		student.setCourse("EC");
		student.setYear(2023);
		//student.setCertificate("ST");
		student.setHallTicketNo(111);
		student.setCollege("Ranchi University");
		
		
		//ADD-DATA-CERTIFICATE
		Certificate certificate=new Certificate();
		
		certificate.setYear(1997);
		certificate.setCollege("NIT");
		cservice.addCertificate(certificate);
		
		
		//set-certificate-to-student
		student.setCertificate(certificate);
		
		IStudentService service = new StudentServiceImpl();
		service.addStudent(student);
		
		System.out.println("one student entry successfull");
		// Retrieve
		/*
		student	= service.searchStudentById(100);
		System.out.println("ID is:"+student.getId());
		System.out.println("Roll is:"+student.getRoll());
		System.out.println("College is:"+student.getCollege());
		
		
		*/
		  
		//
		/*
		// Update
		student	= service.searchStudentById(100);
		student.setCollege("Mumbai University");
		service.updateStudent(student);
		System.out.println("Update is successful");
		*/
		
		
		/*student	= service.searchStudentById(101);
		service.deleteStudent(student);
		System.out.println("Delete is successful");
		*/
		/*
		student	= service.searchStudentByHallTicket(111);
		service.deleteStudent(student);
		System.out.println("Delete is successful");
		*/
		
		
	}

}

