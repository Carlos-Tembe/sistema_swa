package com.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "STOCK_MOVIMENTO")
public class Stock_movimento extends AbstractEntity<Long> {

	@ManyToOne
	@JoinColumn(name = "fornecedor_id")
	private Fornecedor fornecedor;

	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;

	@Column(nullable = false, length = 8)
	@Enumerated(EnumType.STRING)
	private TIPO_MOVIMENTO tipo;

	@Column(nullable = false, length = 8)
	@Enumerated(EnumType.STRING)
	private LOCAL local;

	private double quant_inicial;

	private double quant_final;

	private double preco_compra;

	private double preco_venda;

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public TIPO_MOVIMENTO getTipo() {
		return tipo;
	}

	public void setTipo(TIPO_MOVIMENTO tipo) {
		this.tipo = tipo;
	}

	public LOCAL getLocal() {
		return local;
	}

	public void setLocal(LOCAL local) {
		this.local = local;
	}

	public double getQuant_inicial() {
		return quant_inicial;
	}

	public void setQuant_inicial(double quant_inicial) {
		this.quant_inicial = quant_inicial;
	}

	public double getQuant_final() {
		return quant_final;
	}

	public void setQuant_final(double quant_final) {
		this.quant_final = quant_final;
	}

	public double getPreco_compra() {
		return preco_compra;
	}

	public void setPreco_compra(double preco_compra) {
		this.preco_compra = preco_compra;
	}

	public double getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(double preco_venda) {
		this.preco_venda = preco_venda;
	}

}
