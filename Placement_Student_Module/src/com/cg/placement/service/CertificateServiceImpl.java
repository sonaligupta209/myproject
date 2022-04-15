package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.CertificateRepositoryImpl;
import com.cg.placement.repository.ICertificateRepository;

public class CertificateServiceImpl implements ICertificateService {
	
	// Step 1: Establishing connection between Service and Repo for student modules
		private ICertificateRepository dao;
		
		
		public CertificateServiceImpl() 
		{
			dao = new CertificateRepositoryImpl();
			
		}
	
	
	
	///CURD opreation
	
	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	
	}

	@Override
	public Certificate searchCertificateById(int id) {
		Certificate certificate = dao.searchCertificateById(id);
		return certificate;
	}



	@Override
	public Certificate deleteCertificate(int id) {
		Certificate certificate = dao.deleteCertificate(id);
		return certificate;
	}



	
	

}
