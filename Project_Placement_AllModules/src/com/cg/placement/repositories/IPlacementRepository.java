package com.cg.placement.repositories;

import com.cg.placement.entities.Placement;

public interface IPlacementRepository {

	
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacementById(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	
}
