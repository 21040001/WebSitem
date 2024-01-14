package com.birinchi.WebSitim.HibernateDal;

import java.util.List;

import com.birinchi.WebSitim.Entities.objectsUsers;

public interface IKirish {
	
	List<objectsUsers> getall();
	String username(objectsUsers user);
	String password(objectsUsers user);
	void add(objectsUsers user);
}
