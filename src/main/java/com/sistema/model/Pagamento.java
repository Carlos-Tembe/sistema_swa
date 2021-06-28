package com.sistema.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "PAGAMENTO")
public class Pagamento extends AbstractEntity<Long> {

	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;

	private String forma_pagamento;

	private double valor_pago;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "venda_id", referencedColumnName = "id") })
	private Venda venda;

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public double getValor_pago() {
		return valor_pago;
	}

	public void setValor_pago(double valor_pago) {
		this.valor_pago = valor_pago;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
