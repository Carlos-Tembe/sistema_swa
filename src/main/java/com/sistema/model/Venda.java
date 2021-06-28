package com.sistema.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "VENDA")
public class Venda extends AbstractEntity<Long> {

	private int funcionario_id;

	private String codigo;

	private String estado;

	private String data;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	private String local_entrega;

	private String data_entrega;

	private double total;

	private String tipo;

	@OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
	private List<Item_venda> items = new ArrayList<>();

	@OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
	private List<Pagamento> pagamento = new ArrayList<>();

	public int getFuncionario_id() {
		return funcionario_id;
	}

	public void setFuncionario_id(int funcionario_id) {
		this.funcionario_id = funcionario_id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getLocal_entrega() {
		return local_entrega;
	}

	public void setLocal_entrega(String local_entrega) {
		this.local_entrega = local_entrega;
	}

	public String getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(String data_entrega) {
		this.data_entrega = data_entrega;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Item_venda> getItems() {
		return items;
	}

	public void setItems(List<Item_venda> items) {
		this.items = items;
	}

	public List<Pagamento> getPagamento() {
		return pagamento;
	}

	public void setPagamento(List<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}

}
