package com.cg.placement.services;

import com.cg.placement.entities.Placement;

public interface IPlacementService {
	
	public Placement addPlacement(Placement placement);  
	public Placement updatePlacement(Placement placement);  
	public Placement searchPlacementById(int id);   	
	public boolean cancelPlacement(int id);

}