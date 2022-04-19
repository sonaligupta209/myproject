package com.cg.placement.repositories;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;

public interface ICollegeRepository {

	   public College addCollege(College college);
	   public College updateCollege(College college);
	   public College searchCollegeById(int id);
	   public boolean deleteCollege(int id);
	   
	   public abstract void beginTransaction();
	   public abstract void commitTransaction();

}