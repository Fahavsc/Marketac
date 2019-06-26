package com.market;

import java.io.Serializable;

public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private float preco;
	private float peso;
	private String nome = "";
	private char tipo = ' ';
	
	public long getId() {
		return id;
	}
	public float getPreco() {
		return preco;
	}
	public float getPeso() {
		return peso;
	}
	public String getNome() {
		return nome;
	}
	public char getTipo() {
		return tipo;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	
}
