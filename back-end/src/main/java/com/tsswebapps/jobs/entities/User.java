package com.tsswebapps.jobs.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue
	private UUID id;

	private String nome;

	private String email;

	private String senha;

	private BigDecimal valorHora;

	private BigDecimal faturarPorMes;

	private int diasTrabalharSemana;

	private int horasTrabalharDia;

	private int semanasFeriasAno;

	private String urlFoto;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Job> jobs = new ArrayList<>();

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public BigDecimal getValorHora() {
		return valorHora;
	}

	public void setValorHora(BigDecimal valorHora) {
		this.valorHora = valorHora;
	}

	public BigDecimal getFaturarPorMes() {
		return faturarPorMes;
	}

	public void setFaturarPorMes(BigDecimal faturarPorMes) {
		this.faturarPorMes = faturarPorMes;
	}

	public int getDiasTrabalharSemana() {
		return diasTrabalharSemana;
	}

	public void setDiasTrabalharSemana(int diasTrabalharSemana) {
		this.diasTrabalharSemana = diasTrabalharSemana;
	}

	public int getHorasTrabalharDia() {
		return horasTrabalharDia;
	}

	public void setHorasTrabalharDia(int horasTrabalharDia) {
		this.horasTrabalharDia = horasTrabalharDia;
	}

	public int getFemanasFeriasAno() {
		return semanasFeriasAno;
	}

	public void setFemanasFeriasAno(int femanasFeriasAno) {
		this.semanasFeriasAno = femanasFeriasAno;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(UUID id, String nome, String email, String senha, BigDecimal valorHora, BigDecimal faturarPorMes,
			int diasTrabalharSemana, int horasTrabalharDia, int femanasFeriasAno, String urlFoto, List<Job> jobs) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.valorHora = valorHora;
		this.faturarPorMes = faturarPorMes;
		this.diasTrabalharSemana = diasTrabalharSemana;
		this.horasTrabalharDia = horasTrabalharDia;
		this.semanasFeriasAno = femanasFeriasAno;
		this.urlFoto = urlFoto;
		this.jobs = jobs;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", email=" + email + "]";
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
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	
}
