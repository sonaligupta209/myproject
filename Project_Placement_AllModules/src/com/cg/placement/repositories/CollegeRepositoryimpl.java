package com.cg.placement.repositories;

import javax.persistence.EntityManager;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;

public class CollegeRepositoryimpl implements ICollegeRepository  {

private EntityManager entitymanager;
	
	public CollegeRepositoryimpl() 
	{
		entitymanager =JPAUtil.getEntityManager();            //CREATED  EMPTY CONSTRUCTOR
	}
	
	//CREATE OPERATION IN REPORSITORY
	@Override
	public College addCollege(College college) {              
		entitymanager.persist(college);
		return college;
	}
	
	
	//UPDATE OPERATION
	@Override
	public College updateCollege(College college) {           
		entitymanager.merge(college);
		return college;
	}
	
	
	//SEARCH OPERATION
	@Override
	public College searchCollegeById(int id) {
		College College=entitymanager.find(College.class, id);
		return College;
	}
	
	
	//DELET OPERATION
	@Override
	public boolean deleteCollege(int id)
	{
		College college=entitymanager.find(College.class, id);
		entitymanager.remove(college);
		return false;
	}

	@Override
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
	}
}