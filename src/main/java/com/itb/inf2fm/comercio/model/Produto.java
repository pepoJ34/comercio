package com.itb.inf2fm.comercio.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	
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
	
	
}
