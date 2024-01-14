package com.birinchi.WebSitim.BuisnessLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birinchi.WebSitim.Entities.objectsUsers;
import com.birinchi.WebSitim.HibernateDal.IKirish;


@Service
public class KirishBuisnessLayer implements IKirishBuisnessLayer {

	private IKirish kirish;
	
	
	@Autowired
	public KirishBuisnessLayer(IKirish kirish) {
		this.kirish = kirish;
	}

	@Override
	public String username(objectsUsers user) {
		return kirish.username(user);
	}

	@Override
	public String password(objectsUsers user) {
		return kirish.password(user);
	}

	@Override
	public void add(objectsUsers user) {
		kirish.add(user);
		
	}

	@Override
	public List<objectsUsers> getall() {
		
		return kirish.getall();
	}

}
