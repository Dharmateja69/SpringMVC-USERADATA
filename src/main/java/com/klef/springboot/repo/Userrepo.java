package com.klef.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.springboot.model.User;

public interface Userrepo extends JpaRepository<User, Integer> {

}
