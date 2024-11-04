package com.example.demo.farmacia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Medicamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private String nome;
	
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private String bula;
	
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private String DataValidade;
	
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private int attribute12;
	
	@ManyToOne
	@JoinColumn(name="fornecedor_id")
	private Fornecedor fornecedor;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setBula(String bula) {
		this.bula = bula;
	}
	
	public String getBula() {
		return bula;
	}
	
	public void setDataValidade(String DataValidade) {
		this.DataValidade = DataValidade;
	}
	
	public String getDataValidade() {
		return DataValidade;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getattribute12() {
		return attribute12;
	}
	
	public void setattribute12(int attribute12) {
		this.attribute12 = attribute12;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
}