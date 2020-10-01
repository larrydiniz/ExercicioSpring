package br.com.dh.empresa.model.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_cliente;
	private String nome;
	private String cpf;
	private String data_nasc;
	private String email;
	private String ddd;
	private String telefone;
	private String cep;
	private String rua_numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	@OneToMany(mappedBy = "cliente")
	@JsonIgnoreProperties("cliente")
	private Set<Pedido> pedidos;
	
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String data_nasc, String email, String ddd, String telefone,
			String cep, String rua_numero, String complemento, String bairro, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
		this.email = email;
		this.ddd = ddd;
		this.telefone = telefone;
		this.cep = cep;
		this.rua_numero = rua_numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getData_nasc() {
		return data_nasc;
	}


	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getRua_numero() {
		return rua_numero;
	}


	public void setRua_numero(String rua_numero) {
		this.rua_numero = rua_numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getId_cliente() {
		return id_cliente;
	}
}
