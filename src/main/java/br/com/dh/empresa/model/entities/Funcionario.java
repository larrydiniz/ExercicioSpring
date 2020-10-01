package br.com.dh.empresa.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_funcionario;
	private String nome;
	private String cpf;
	private String data_nasc;
	private String cargo;
	private String email;
	private double salario;
	private String senha;
	private int habilitado;
	
	public Funcionario () {}
	
	public Funcionario(String nome, String cpf, String data_nasc, String cargo, String email, double salario,
			String senha, int habilitado) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
		this.cargo = cargo;
		this.email = email;
		this.salario = salario;
		this.senha = senha;
		this.habilitado = habilitado;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(int habilitado) {
		this.habilitado = habilitado;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
