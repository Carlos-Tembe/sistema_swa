package com.sistema.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ITEM_VENDA")
public class Item_venda extends AbstractEntity<Long> {

	@ManyToOne(cascade = CascadeType.ALL)
	private Artigo artigo;

	private double preco_unitario;

	private double quantidade;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "venda_id", referencedColumnName = "id") })
	private Venda venda;

	private double item_montante;

	public Artigo getArtigo() {
		return artigo;
	}

	public void setArtigo(Artigo artigo) {
		this.artigo = artigo;
	}

	public double getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public double getItem_montante() {
		return item_montante;
	}

	public void setItem_montante(double item_montante) {
		this.item_montante = item_montante;
	}

}
