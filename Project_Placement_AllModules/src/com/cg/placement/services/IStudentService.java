package com.cg.placement.services;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;

public interface IStudentService {

	public Student addStudent(Student student);  
	public Student updateStudent(Student student);  
	public Student searchStudentById(int id); 

	public Student searchStudentByHallTicket(int id); 
	public boolean addCertificate(Certificate certificate);
	public boolean updateCertificate(Certificate certificate);
	public boolean deleteStudent(int id);
	
}
