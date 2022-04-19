package com.cg.placement.services;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.repositories.CollegeRepositoryimpl;
import com.cg.placement.repositories.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService{

	//STEP 1_ESTABLISHING CONNECTION BETWEEN SERVICE AND REPOSITORY FILES
		private ICollegeRepository dao;
		
		public CollegeServiceImpl() 
		{
			dao = new CollegeRepositoryimpl();
			
		}
	//STEP 2_SERVICE CALLS TO PERFORM CRUD OPERTAIONS.
		@Override
		public College addCollege(College college) {
			 
			dao.beginTransaction();
			dao.addCollege(college);
			dao.commitTransaction();
			return college;
		}		
		
		@Override
		public College updateCollege(College college) {
			 
			dao.beginTransaction();
			dao.updateCollege(college);
			dao.commitTransaction();
			return college;
		
		}

		@Override
		public College searchCollegeById(int id) 
		{
			College cllege=dao.searchCollegeById(id);
			
			
			return cllege;
		}

		@Override
		public boolean deleteCollege(int id) {
			dao.beginTransaction();
			dao.deleteCollege(id);
			dao.commitTransaction();
			
			return false;
		}
		
		@Override
		public boolean schedulePlacement(Placement placement)
		{
			dao.beginTransaction();
			//dao.schedulePlacement(placement);
			dao.commitTransaction();
			return false;
		
		}
}
