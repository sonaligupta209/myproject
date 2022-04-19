package com.cg.placement.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.entities.Student;
import com.cg.placement.entities.User;
import com.cg.placement.services.PlacemnetServiceImpl;
import com.cg.placement.services.StudentServiceImpl;
import com.cg.placement.services.UserServiceImpl;
import com.cg.placement.services.CertificateServiceImpl;
import com.cg.placement.services.CollegeServiceImpl;
import com.cg.placement.services.ICertificateService;
import com.cg.placement.services.ICollegeService;
import com.cg.placement.services.IPlacementService;
import com.cg.placement.services.IStudentService;
import com.cg.placement.services.IUserService;

public class ClientPlacement {

	public static void main(String[] args) {
		
		//CRUD OPERATION CALLING ACTIVITY for college and Placement.
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		em.getTransaction().begin();

		/*Placement placement = new Placement();
		IPlacementService Pservice = new PlacemnetServiceImpl();	
		Placement placement1 = new Placement();
		IPlacementService Pservice1 = new PlacemnetServiceImpl();
	*/
		
		/*College college=new College();
		ICollegeService Cservice= new CollegeServiceImpl();
		College college1=new College();
		ICollegeService Cservice1 = new CollegeServiceImpl();*/
		
		Student student = new Student();
		IStudentService Sservice = new StudentServiceImpl();
		
		/*User user = new User();
		IUserService Uservice = new  UserServiceImpl();*/
		
		Certificate certificate = new Certificate();	
		ICertificateService Crserivece = new CertificateServiceImpl();
		
		/*Admin admin = new Admin();*/
		
		//college, student, certificate association
		
	//college reocord create
		/*college.setCollegeAdmin("Sonali");
		/*college.setId(101);
		college.setCollegeName("SKN College");
		college.setLocation("pune");
		Cservice.addCollege(college)*/
		
		///certificate record create 
		certificate.setId(101);
		certificate.setYear(2021);
		//certificate.setCollege(college);
		Crserivece.addCertificate(certificate);
		///Student record create 
		student.setId(101);
		student.setName("sonali");
		student.setRoll(011);
	//	student.setCollege(college);
		student.setCourse("CSE");
		student.setCertificate(certificate);
		student.setYear(2021);
		student.setHallTicketNo(100001);
		Sservice.addStudent(student);
		///List<Student> list=new ArrayList<Student>();
	///	list.add(student);
	//	college.setStudent(list);
		certificate.setStudent(student);
		
		//List<Certificate> list1=new ArrayList<Certificate>();
		//list1.add(certificate);
	///	college.setCertificate(list1);
		//student.setCollege(college);
		student.setCertificate(certificate);
		
		System.out.println("Record added...");
		
		// Create   //association college, user and admin
		
	/*	admin.setId(6);
		admin.setName("sam");
		admin.setPassword("1234");
		//admin.setUser(user);
			
		college.setId(6);
		college.setCollegeAdmin("sam");
		college.setCollegeName("PDA College");
		college.setLocation("Karnataka Gulbarga");
		Cservice.addCollege(college);
			
		user.setId(6);
		user.setName("Shaikh Amer");
		user.setType("user");
		user.setPassword("12345");
		user.setAdmin(admin);
		user.setCollege(college);
		Uservice.addUser(user);
		
		System.out.println("Record added ");
*/
		// Creating College record // college and placement association

	/*	college.setCollegeAdmin("SAM");
		college.setId(107);
		college.setCollegeName("KBN College");
		college.setLocation("Gulbarga");
		Cservice.addCollege(college);
		
		// Creating Placement record
		
		placement.setP_id(1);
		placement.setS_name("Asif");
		placement.setCollege(college);
		placement.setDate("12/03/2023"); 
		placement.setQualification("B.E");
		placement.setYear(2021);
		
		Pservice.addPlacement(placement);
		
		placement1.setP_id(2);
		placement1.setS_name("Ahmed");
		placement1.setCollege(college);
		placement1.setDate("12/03/2023");
		placement1.setQualification("B.E");
		placement1.setYear(2021);
		
		Pservice1.addPlacement(placement1);
		
		List<Placement> list=new ArrayList<Placement>();
		list.add(placement1);
		list.add(placement);
		college.setPlacement(list);
		
		System.out.println("Record added");
		*/ 
		
		// Create	// admin and user association
	/*	admin.setId(8);
		admin.setName("xyz");
		admin.setPassword("1234");
		admin.setUser(user);
		
		user.setId(13);
		user.setName("Shaikh Amer");
		user.setType("user");
		user.setPassword("12345");
		user.setAdmin(admin);
		Uservice.addUser(user);	
	
		em.getTransaction().commit();
		System.out.println("Record added ");
		*/
		//======================================================================================
	/*
		// Retrieve Placement record
		System.out.println("Placement Details are : ");
		placement	= Pservice.searchPlacementById(2);
		//college = Cservice.searchCollegeById(107);
		System.out.println("ID is:"+placement.getP_id());
		System.out.println("Student Name is:"+placement.getS_name());
		//System.out.println("College name is:"+college.getCollegeName());
		System.out.println("Qualification is:"+placement.getQualification());
		System.out.println("Date is:"+placement.getDate());
		System.out.println("Year is:"+placement.getYear());
			
		// Retrieve college record
		System.out.println("====================================");
		System.out.println("College Details are : ");
		college = Cservice.searchCollegeById(107);
		System.out.println(college.getId());
		System.out.println("College Admin is : "+college.getCollegeAdmin());
		System.out.println("College name is : "+college.getCollegeName());
		*/
		
		// Retrieve student record
	/*	System.out.println("Student details are...");
		student = Sservice.searchStudentById(1);
		System.out.println("Student id : "+student.getId());
		System.out.println("Student name : "+student.getName());
		System.out.println("Student course : "+student.getCourse());
*/

		// Retrieve certificate record
		/*certificate = Crserivece.searchCertificateById(1);
		student = Sservice.searchStudentById(1);
		college = Cservice.searchCollegeById(16);
		System.out.println("Certificate id : "+certificate.getId());
		System.out.println("Certificate student name : "+student.getName());
		System.out.println("Certificate college name  : "+college.getCollegeName());
		System.out.println("Certificate year : "+certificate.getYear()); 
		
		//=====================================================================================

		// Update Placement record
	/*	placement	= Pservice.searchPlacementById(4);
		placement.setDate("24 April 2021");
		System.out.println("Update is successful");
*/
		// Update college record

	/*	college = Cservice.searchCollegeById(107);
		college.setLocation("Maheboob Nagar Gulbarga");
		college = Cservice.updateCollege(college);
		Pservice.updatePlacement(placement);
		System.out.println("Update is successful");
		*/
		// Update Student record
	/*	  student = Sservice.searchStudentById(1);
		  student.setRoll(001);
*/

		//=====================================================================================
		// Delete Placement record				
	/*	placement	= Pservice.searchPlacementById(4);
		Pservice.cancelPlacement(placement);
		
		System.out.println("Canceled and Deletion is successful");
	*/

	}
}