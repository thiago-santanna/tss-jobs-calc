package com.tsswebapps.jobs.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsswebapps.jobs.dto.JobFormDto;
import com.tsswebapps.jobs.dto.JobResponseDto;
import com.tsswebapps.jobs.entities.Job;
import com.tsswebapps.jobs.entities.User;
import com.tsswebapps.jobs.repository.JobRepository;

@Service
public class JobCrudService {

	@Autowired
	private JobRepository repository;

	private UserCrudService userCrudService;

	public Job jobPorId(UUID id) {
		Optional<Job> byId = repository.findById(id);
		return byId.orElse(null);
	}

	public JobResponseDto salvarJob(JobFormDto jobFormDto) {
		User user = userCrudService
				.findByIdOptional(jobFormDto.getUserId())
				.orElseThrow(RuntimeException::new);

		Job jobSaved = repository.save(jobFormDto.toJob(user));

		return new JobResponseDto(jobSaved.getId().toString(), jobSaved.getNome());
	}
	
	public JobResponseDto salvarJob(Job job) {
		Job jobSaved = repository.save(job);

		return new JobResponseDto(jobSaved.getId().toString(), jobSaved.getNome());
	}

	public void apagarJob(Job job) {
		repository.delete(job);
	}

	public List<JobFormDto> listarJobsUsuario(UUID userId) {
		return repository.findByUserId(userId)
				.stream().map(JobFormDto::toJobDto)
				.collect(Collectors.toList());
	}
}
