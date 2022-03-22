package com.tsswebapps.jobs.dto;

public class JobResponseDto {
	
	private String id;
	private String nome;

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public JobResponseDto(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

}
