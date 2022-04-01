package com.cg.placement.repository;
import javax.persistence.EntityManager;
import com.cg.placement.entities.user;

public class userrepoimpl implements userrepo
{
	//Step 1: Start JPA LifeCycle
	
	private EntityManager entityManager;
	public void StudentRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public user addnewuser(user user1) {
		entityManager.persist(user1);
		return user1;
	}

	@Override
	public user updateuser(user user1) {
		entityManager.persist(user1);
		return user1;
	}

	@Override
	public void deleteStudent(int id) {
		user user1 = entityManager.find(user.class, id);
		entityManager.remove(user1);
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void login(user user1) {
	
		entityManager.getTransaction().commit();
	}

	@Override
	public void logout() {
		entityManager.getTransaction().commit();
		
	}

}
