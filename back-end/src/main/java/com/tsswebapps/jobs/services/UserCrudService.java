package com.tsswebapps.jobs.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsswebapps.jobs.entities.User;
import com.tsswebapps.jobs.repository.UserRepository;

@Service
public class UserCrudService {

	@Autowired
	private UserRepository repository;
	
	
	public Optional<User> findById(UUID id) {
		Optional<User> byId = repository.findById(id);
		return byId;
	}
}
