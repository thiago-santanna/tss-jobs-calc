package com.tsswebapps.jobs.dto;

import java.math.BigDecimal;
import java.util.UUID;

import com.tsswebapps.jobs.entities.User;

public class UserFormDto {
	
	private String id;

	private String nome;

	private String email;

	private String senha;

	private BigDecimal valorHora;

	private BigDecimal faturarPorMes;

	private int diasTrabalharSemana;

	private int horasTrabalharDia;

	private int femanasFeriasAno;

	private String urlFoto;
	
	public String getId() {
		return id;
	}

	public UserFormDto(String id, String nome, String email, String senha, BigDecimal valorHora,
			BigDecimal faturarPorMes, int diasTrabalharSemana, int horasTrabalharDia, int femanasFeriasAno,
			String urlFoto) {

		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.valorHora = valorHora;
		this.faturarPorMes = faturarPorMes;
		this.diasTrabalharSemana = diasTrabalharSemana;
		this.horasTrabalharDia = horasTrabalharDia;
		this.femanasFeriasAno = femanasFeriasAno;
		this.urlFoto = urlFoto;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public BigDecimal getValorHora() {
		return valorHora;
	}

	public BigDecimal getFaturarPorMes() {
		return faturarPorMes;
	}

	public int getDiasTrabalharSemana() {
		return diasTrabalharSemana;
	}

	public int getHorasTrabalharDia() {
		return horasTrabalharDia;
	}

	public int getFemanasFeriasAno() {
		return femanasFeriasAno;
	}

	public String getUrlFoto() {
		return urlFoto;
	}
	
	public User toUser() {	
		return new User(null, this. nome, this.email, this.senha, this.valorHora, 
				this.faturarPorMes, this.diasTrabalharSemana, this.horasTrabalharDia, this.femanasFeriasAno, 
				this.urlFoto, null);
	}

}
