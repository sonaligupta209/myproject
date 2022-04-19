package com.cg.placement.services;

import com.cg.placement.entities.Placement;
import com.cg.placement.repositories.PlacementRepoImpl;
import com.cg.placement.repositories.IPlacementRepository;

public class PlacemnetServiceImpl implements IPlacementService {

	// Step 1: Establishing connection between Service and Repository
		private IPlacementRepository dao;
		
		public PlacemnetServiceImpl() {
			dao = new PlacementRepoImpl();
			
		}
		// Step 2: Service calls to perform CRUD Operation

		@Override
		public Placement addPlacement(Placement placement) {
			dao.beginTransaction();
			dao.addPlacement(placement);
			dao.commitTrasaction();
			return placement;
			}

		@Override
		public Placement updatePlacement(Placement placement) {
			dao.beginTransaction();
			dao.updatePlacement(placement);
			dao.commitTrasaction();
			return placement;
		}

		@Override
		public Placement searchPlacementById(int id) {
			Placement placement = dao.searchPlacementById(id);

			return placement;
		}


		@Override
		public boolean cancelPlacement(int id) {
			dao.beginTransaction();
			 dao.searchPlacementById(id);
			dao.commitTrasaction();
			return false;
		}
}