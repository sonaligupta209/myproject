package com.cg.placement.repositories;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository {
	
	// JPA Life cycle starts
	private EntityManager entityManager;
	public CertificateRepositoryImpl()
	    {
		   entityManager = JPAUtil.getEntityManager();
	    }	

	// Create Operation Certificate Repository
	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificateById(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		entityManager.remove(certificate);
		return certificate;
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();;
	}
	 
}
