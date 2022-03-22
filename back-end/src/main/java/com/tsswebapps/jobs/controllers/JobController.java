package com.tsswebapps.jobs.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsswebapps.jobs.dto.JobFormDto;
import com.tsswebapps.jobs.dto.JobResponseDto;
import com.tsswebapps.jobs.entities.Job;
import com.tsswebapps.jobs.services.JobCrudService;

@RestController
@RequestMapping("/jobs")
public class JobController {

	private JobCrudService jobCrudService;
	
	@PostMapping
	public ResponseEntity<JobResponseDto> salvar(@RequestBody JobFormDto formDto) {
		JobResponseDto job = jobCrudService.salvarJob(formDto);
		return new ResponseEntity<>(job, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<JobResponseDto> alterar(@PathVariable UUID id, @RequestBody JobFormDto formDto) {
		Job jobPorId = jobCrudService.jobPorId(id);
		jobPorId.copyJob(formDto);
		
		JobResponseDto job = jobCrudService.salvarJob(jobPorId);
		return new ResponseEntity<>(job, HttpStatus.CREATED);
	}	
	
}
