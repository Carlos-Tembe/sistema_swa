package com.sistema.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "LOGIN")
public class Login extends AbstractEntity<Long> {

	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;

	private LocalDate log_inicio;

	private LocalDate log_fim;

	private LocalDate data;

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public LocalDate getLog_inicio() {
		return log_inicio;
	}

	public void setLog_inicio(LocalDate log_inicio) {
		this.log_inicio = log_inicio;
	}

	public LocalDate getLog_fim() {
		return log_fim;
	}

	public void setLog_fim(LocalDate log_fim) {
		this.log_fim = log_fim;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}