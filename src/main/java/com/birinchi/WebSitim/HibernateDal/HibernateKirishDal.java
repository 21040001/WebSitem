package com.birinchi.WebSitim.HibernateDal;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.birinchi.WebSitim.Entities.objectsUsers;
import jakarta.persistence.EntityManager;

@Repository 
public class HibernateKirishDal implements IKirish{

	private EntityManager entityManager;
	
	
	@Autowired
	public HibernateKirishDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	

	@Override
	@Transactional
	public String username(objectsUsers user) {
	
		Session session = entityManager.unwrap(Session.class);
		objectsUsers username = session.get(objectsUsers.class, user.getId());
		String soru = username.getUsername();
		return soru;
	}

	@Override
	@Transactional
	public String password(objectsUsers user ) {
		Session session = entityManager.unwrap(Session.class);
		objectsUsers password = session.get(objectsUsers.class, user.getId());
		String newPassword = password.getPassword();
		return newPassword;
	}


	@Override
	@Transactional
	public void add(objectsUsers user) {
		
		Session session =entityManager.unwrap(Session.class);
		session.persist(user);
	}


	@Override
	@Transactional
	public List<objectsUsers> getall() {
		Session session = entityManager.unwrap(Session.class);
		List<objectsUsers> list=session.createNativeQuery("Select * from kirishData.dbo.kirish_users ",objectsUsers.class).getResultList();
		return list;
	}

}
