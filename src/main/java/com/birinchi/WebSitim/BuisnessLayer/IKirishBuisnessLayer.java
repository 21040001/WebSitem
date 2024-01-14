package com.birinchi.WebSitim.BuisnessLayer;

import java.util.List;

import com.birinchi.WebSitim.Entities.objectsUsers;

public interface IKirishBuisnessLayer {

	List<objectsUsers> getall();
	String username(objectsUsers user);
	String password(objectsUsers user);
	void add(objectsUsers user);
}
