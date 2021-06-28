package com.sistema.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ESTABELECIMENTO")
public class Estabelecimento extends AbstractEntity<Long> {

	private String nome;

	private String morada;

	private int nuit;

	private String conta_banco;

	private int telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public int getNuit() {
		return nuit;
	}

	public void setNuit(int nuit) {
		this.nuit = nuit;
	}

	public String getConta_banco() {
		return conta_banco;
	}

	public void setConta_banco(String conta_banco) {
		this.conta_banco = conta_banco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
