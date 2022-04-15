package com.cg.placement.repository;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;

public interface IStudentRepository 
{

	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int hallTicketNo);
	public Student deleteStudent(Student student);
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	void deleteStudent(int id);
	
}

