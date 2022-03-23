package com.tsswebapps.jobs.dto;

import java.math.BigDecimal;
import java.util.UUID;

import com.tsswebapps.jobs.entities.Job;
import com.tsswebapps.jobs.entities.User;

public class JobFormDto {

	private String id;

	private String nome;

	private String empresaSolicitante;

	private String descricao;

	private int horasDia;

	private int horasEstimadaJob;

	private BigDecimal valorEstimadoJob;

	private UUID userId;

	public String getNome() {
		return nome;
	}

	public String getEmpresaSolicitante() {
		return empresaSolicitante;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getHorasDia() {
		return horasDia;
	}

	public int getHorasEstimadaJob() {
		return horasEstimadaJob;
	}

	public BigDecimal getValorEstimadoJob() {
		return valorEstimadoJob;
	}

	public UUID getUserId() {
		return userId;
	}

	public JobFormDto(String id, String nome, String empresaSolicitante, String descricao, int horasDia,
			int horasEstimadaJob, BigDecimal valorEstimadoJob, UUID userId) {
		this.id = id;
		this.nome = nome;
		this.empresaSolicitante = empresaSolicitante;
		this.descricao = descricao;
		this.horasDia = horasDia;
		this.horasEstimadaJob = horasEstimadaJob;
		this.valorEstimadoJob = valorEstimadoJob;
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static JobFormDto toJobDto(Job job) {
		return new JobFormDto(job.getId().toString(), job.getNome(), job.getEmpresaSolicitante(), job.getDescricao(),
				job.getHorasDia(), job.getHorasEstimadaJob(), job.getValorEstimadoJob(), job.getUser().getId());
	}

	public Job toJob(User user) {
		return new Job(this.id == null ? null : UUID.fromString(this.id), this.nome, this.empresaSolicitante,
				this.descricao, this.horasDia, this.horasEstimadaJob, this.valorEstimadoJob, user);
	}

}
