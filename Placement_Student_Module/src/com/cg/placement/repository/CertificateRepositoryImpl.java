package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository{
	
	
	//Step 1: Start JPA LifeCycle
		private EntityManager entityManager;
		public CertificateRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		// Create operation - Repo/DAO

	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		entityManager.persist(certificate);
		return certificate;
	}
	//****************nextstep
	@Override
	public Certificate updateCertificate(Certificate certificate)
	{
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificateById(int id) {
		 Certificate  certificate = entityManager.find( Certificate.class, id);
		return  certificate;
	}
	@Override
	public Certificate deleteCertificate(int id) {
		Certificate  certificate = entityManager.find( Certificate.class, id);
		entityManager.remove(certificate);
		return  certificate;
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
		
	}
}
