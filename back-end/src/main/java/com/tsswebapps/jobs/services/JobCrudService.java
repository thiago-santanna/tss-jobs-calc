package com.tsswebapps.jobs.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsswebapps.jobs.dto.JobDto;
import com.tsswebapps.jobs.dto.JobSavedDto;
import com.tsswebapps.jobs.entities.Job;
import com.tsswebapps.jobs.entities.User;
import com.tsswebapps.jobs.repository.JobRepository;

@Service
public class JobCrudService {

	@Autowired
	private JobRepository repository;

	private UserCrudService userCrudService;

	private Job jobPorId(UUID id) {
		Optional<Job> byId = repository.findById(id);
		return byId.orElse(null);
	}

	public JobSavedDto salvarJob(JobDto jobDto) {
		User user = userCrudService
				.findByIdOptional(jobDto.getUserId())
				.orElseThrow(RuntimeException::new);

		Job jobSaved = repository.save(jobDto.toJob(user));

		return new JobSavedDto(jobSaved.getId().toString(), jobSaved.getNome());
	}

	public void apagarJob(Job job) {
		repository.delete(job);
	}

	public List<JobDto> listarJobsUsuario(UUID userId) {
		return repository.findByUserId(userId)
				.stream().map(JobDto::toJobDto)
				.collect(Collectors.toList());
	}
}
