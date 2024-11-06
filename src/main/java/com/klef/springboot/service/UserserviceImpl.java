package com.klef.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.springboot.model.User;
import com.klef.springboot.repo.Userrepo;

@Service
public class UserserviceImpl implements Userservice {
	@Autowired
	private Userrepo urepo;

	@Override
	public String addEmp(User user) {
		// TODO Auto-generated method stub
		urepo.save(user);
		return "added successfuly!!";
	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

}
