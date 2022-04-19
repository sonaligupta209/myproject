package com.cg.placement.services;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;
import com.cg.placement.repositories.IStudentRepository;
import com.cg.placement.repositories.StudentRepositoryImpl;

public class StudentServiceImpl implements IStudentService {

	// Step 1: Establishing connection between Service and Repo
	private IStudentRepository dao;
	public StudentServiceImpl() {
		dao = new StudentRepositoryImpl();
	}	
	
	// Step 2: Service calls to perform CRUD Operation
	@Override
	public Student addStudent(Student student) {
      dao.beginTransaction();
      dao.addStudent(student);
      dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = dao.searchStudentByHallTicket(hallTicketNo);
		return student;
	}

	@Override
	public boolean deleteStudent(int id) {
		dao.beginTransaction();
		dao.deleteStudent(id);
		dao.commitTransaction();
		return false;
	}

	@Override
	public boolean addCertificate(Certificate certificate) {
		dao.beginTransaction();
		//dao.addCertificate(certificate);
		dao.commitTransaction();
		return false;
	}

	@Override
	public boolean updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		//dao.updateCertificate(certificate);
		dao.commitTransaction();
			return false;
	}
}
