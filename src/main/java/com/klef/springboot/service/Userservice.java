package com.klef.springboot.service;

import java.util.List;

import com.klef.springboot.model.User;

public interface Userservice {
	
	
	public String addEmp(User user);
	
	public List<User> getall( );
}
