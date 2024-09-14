package br.edu.infnet.pessoa.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	@Column(name = "cpfCnpj")
	private String cpfCnpj;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name = "endereco")
	private String Endereco;
	
	@Column(name="dataNascimento")
	private LocalDate dataNasc;
	
	
	
	public Pessoa() {
		
	}



	public Pessoa(String cpfCnpj, String nome, String endereco, LocalDate dataNasc) {
		this.cpfCnpj = cpfCnpj;
		this.nome = nome;
		this.Endereco = endereco;
		this.dataNasc = dataNasc;
	}



	public String getCpfCnpj() {
		return cpfCnpj;
	}



	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return Endereco;
	}



	public void setEndereco(String endereco) {
		Endereco = endereco;
	}



	public LocalDate getDataNasc() {
		return dataNasc;
	}



	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Pessoa [cpfCnpj=" + cpfCnpj + ", nome=" + nome + ", Endereco=" + Endereco + ", dataNasc=" + dataNasc
				+ "]";
	}


}
