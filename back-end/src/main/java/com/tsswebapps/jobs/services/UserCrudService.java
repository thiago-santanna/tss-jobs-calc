package com.tsswebapps.jobs.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsswebapps.jobs.dto.UserSaveDto;
import com.tsswebapps.jobs.dto.UserSavedDto;
import com.tsswebapps.jobs.entities.User;
import com.tsswebapps.jobs.repository.UserRepository;

@Service
public class UserCrudService {

	@Autowired
	private UserRepository repository;
	
	
	public Optional<User> findByIdOptional(UUID id) {
		Optional<User> byId = repository.findById(id);
		return byId;
	}
	
	public User findById(UUID id) {
		return repository.findById(id).orElse(null);
	}
	
	public UserSavedDto salvarUsuario(UserSaveDto userDto) {
		User user = repository.save(userDto.toUser());
		
		return new UserSavedDto(user.getId().toString(), user.getNome());
	}
}
