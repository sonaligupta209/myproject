package com.cg.placement.repository;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;

public interface ICertificateRepository {
	public Certificate addCertificate(Certificate certificate) ;
	public Certificate  updateCertificate(Certificate certificate);
	public  Certificate searchCertificateById(int id); 
	public Certificate deleteCertificate(int id);
	public void beginTransaction();
	public void commitTrasaction();
	
   
}
