package com.tsswebapps.jobs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsswebapps.jobs.dto.UserFormDto;
import com.tsswebapps.jobs.dto.UserResponseDto;
import com.tsswebapps.jobs.services.UserCrudService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserCrudService userCrudService;
	
	@PostMapping
	public ResponseEntity<UserResponseDto> salvar(@RequestBody UserFormDto userDto ) {
		UserResponseDto usuario = userCrudService.salvarUsuario(userDto);
		return new ResponseEntity<>(usuario, HttpStatus.CREATED);
	}
}
