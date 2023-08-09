package com.itb.inf2fm.comercio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")

public class Produto {
	
	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-Incremento
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	private boolean codStatus;
	
	//public: Acesso liberado para todas as classes
	//private: Acesso permitido apenas para os membros da própria classe.
	//Entende-se por membros(atributos e ou métodos)
	
	//Métodos Setter's e Getter's: atribuir e recuperar dados do atributo "RESPECTIVAMENTE"
	
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao(){
		return descricao;
	}
	
	public void setCodigoBarras(String codigoBarras){
		this.codigoBarras = codigoBarras;
	}
	public String getCodigoBarras(){
		return codigoBarras;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	public double getPreco(){
		return preco;
	}
	
	public void setCodStatus(boolean codStatus){
		this.codStatus = codStatus;
	}
	public boolean getCodStatus(){
		return codStatus;
	}
	
	
}
