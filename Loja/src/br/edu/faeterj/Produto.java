package br.edu.faeterj;

public class Produto {
	public String nome;
	public double valor;
	public int quant;
	public String descricao;
	public String codBarra;
	
	public Produto(String nome, double valor, int quant, String descricao, String codBarra){
		this.nome = nome;
		this.valor = valor;
		this.quant = quant;
		this.descricao = descricao;
		this.codBarra = codBarra;
	}
}