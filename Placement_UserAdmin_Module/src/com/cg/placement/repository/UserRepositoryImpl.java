package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.User;

public class UserRepositoryImpl implements IUserRepository{
	private EntityManager entityManager;
	public UserRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public User addnewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTrasaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}
	@Override
	public void login(User user) {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void logout() {
		entityManager.getTransaction().commit();
	}
	@Override
	public void deleteUser(int id) {

		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
		
	}
}

