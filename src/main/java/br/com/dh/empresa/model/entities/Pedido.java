package br.com.dh.empresa.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Pedido {
	@Id
	private String nota_fiscal;
	private String data_pedido;
	private double valor_total;
	private String status_pedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente")
	@JsonIgnoreProperties({"pedidos", "fk_id_cliente"})
	private Cliente cliente;
	
	public Pedido () {}
	
	public Pedido(String nota_fiscal, String data_pedido, double valor_total, String status_pedido, Cliente cliente) {
		super();
		this.nota_fiscal = nota_fiscal;
		this.data_pedido = data_pedido;
		this.valor_total = valor_total;
		this.status_pedido = status_pedido;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNota_fiscal() {
		return nota_fiscal;
	}

	public void setNota_fiscal(String nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}

	public String getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(String data_pedido) {
		this.data_pedido = data_pedido;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public String getStatus_pedido() {
		return status_pedido;
	}

	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}
	
}
