package com.example.demo.farmacia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Farmacia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private String nome;
	
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private int cnpj;
	
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private int idFornecedor;
	

	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void getidFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
		
	}
	
	public int getidFornecedor() {
		return idFornecedor;
	}
	
	public void getCnpj(int cnpj) {
		this.cnpj = cnpj;
		
	}
	
	public int getcnpj() {
		return cnpj;
	}
	
}
