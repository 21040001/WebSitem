package com.birinchi.WebSitim.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birinchi.WebSitim.BuisnessLayer.IKirishBuisnessLayer;
import com.birinchi.WebSitim.Entities.objectsUsers;

@RestController
@RequestMapping("/api")
public class RController {

	private IKirishBuisnessLayer buisnessLayer;

	@Autowired
	public RController(IKirishBuisnessLayer buisnessLayer) {
		this.buisnessLayer = buisnessLayer;
	}
	
	@PostMapping("/username")
	public String username(@RequestBody objectsUsers user) {
		
		return buisnessLayer.username(user);
	}
	
	@PostMapping("/password")
	public String password(@RequestBody objectsUsers user) {
		
		return buisnessLayer.password(user);
	}
	
	@GetMapping("/all")
	public List<objectsUsers> getall(){
		
		return buisnessLayer.getall();	}
	
	@PostMapping("/add")
	public void add(@RequestBody objectsUsers user) {
		buisnessLayer.add(user);
	}
}
