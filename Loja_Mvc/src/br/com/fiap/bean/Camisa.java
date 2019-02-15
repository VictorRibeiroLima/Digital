package br.com.fiap.bean;

import java.io.Serializable;

public class Camisa implements Comparable<Camisa>,Serializable{
	private static final long serialVersionUID = -1846755896866651231L;
	private int id;
	private String cor;
	private double preco;
	private String descricao;
	private int qtd;
	public int compareTo(Camisa ca) {
		if(this.id<ca.id)
			return -1;
		else if(this.id>ca.id)
			return 1;
		else
			return 0;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
