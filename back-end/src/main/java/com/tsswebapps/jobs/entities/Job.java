package com.tsswebapps.jobs.entities;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Job {
	@Id
	@GeneratedValue
	private UUID id;

	private String nome;

	private String empresaSolicitante;

	private String descricao;

	private int horasDia;

	private int horasEstimadaJob;

	private BigDecimal valorEstimadoJob;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresaSolicitante() {
		return empresaSolicitante;
	}

	public void setEmpresaSolicitante(String empresaSolicitante) {
		this.empresaSolicitante = empresaSolicitante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getHorasDia() {
		return horasDia;
	}

	public void setHorasDia(int horasDia) {
		this.horasDia = horasDia;
	}

	public int getHorasEstimadaJob() {
		return horasEstimadaJob;
	}

	public void setHorasEstimadaJob(int horasEstimadaJob) {
		this.horasEstimadaJob = horasEstimadaJob;
	}

	public BigDecimal getValorEstimadoJob() {
		return valorEstimadoJob;
	}

	public void setValorEstimadoJob(BigDecimal valorEstimadoJob) {
		this.valorEstimadoJob = valorEstimadoJob;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", nome=" + nome + "]";
	}

	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(UUID id, String nome, String empresaSolicitante, String descricao, int horasDia, int horasEstimadaJob,
			BigDecimal valorEstimadoJob, User user) {
		this.id = id;
		this.nome = nome;
		this.empresaSolicitante = empresaSolicitante;
		this.descricao = descricao;
		this.horasDia = horasDia;
		this.horasEstimadaJob = horasEstimadaJob;
		this.valorEstimadoJob = valorEstimadoJob;
		this.user = user;
	}
}
