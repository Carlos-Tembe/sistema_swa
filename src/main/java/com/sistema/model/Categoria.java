package com.sistema.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CATEGORIA")
public class Categoria extends AbstractEntity<Long> {

	@Column(nullable = false, name = "id")
	private int id;

	@Column(nullable = false, length = 45)
	private String nome;

	@Column(nullable = false, length = 150)
	private String descricao;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Artigo> artigos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
