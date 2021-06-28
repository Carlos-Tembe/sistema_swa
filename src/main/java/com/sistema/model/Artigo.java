package com.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ARTIGO")
public class Artigo extends AbstractEntity<Long> {

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	@Column(nullable = true, length = 100)
	private String descricao;

	@Column(nullable = true, length = 45)
	private String codigo_barra;

	@Column(nullable = true)
	private double preco_unitario;

	@Column(nullable = false)
	private double quant_loja;

	@Column(nullable = true, length = 45)
	private String quant_armazem;

	@Column(nullable = true, length = 45)
	private String quan_min;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo_barra() {
		return codigo_barra;
	}

	public void setCodigo_barra(String codigo_barra) {
		this.codigo_barra = codigo_barra;
	}

	public double getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

	public double getQuant_loja() {
		return quant_loja;
	}

	public void setQuant_loja(double quant_loja) {
		this.quant_loja = quant_loja;
	}

	public String getQuant_armazem() {
		return quant_armazem;
	}

	public void setQuant_armazem(String quant_armazem) {
		this.quant_armazem = quant_armazem;
	}

	public String getQuan_min() {
		return quan_min;
	}

	public void setQuan_min(String quan_min) {
		this.quan_min = quan_min;
	}

}
