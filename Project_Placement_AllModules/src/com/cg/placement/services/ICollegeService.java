package com.cg.placement.services;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;

public interface ICollegeService {

	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollegeById(int id);
	public boolean deleteCollege(int id);
	public boolean schedulePlacement(Placement placement);

}
