package com.example.muumi.model;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {
	User findByUsername(String username);
	}
