package br.edu.faeterj;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Produto> lproduto = new ArrayList();
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite as informações do produto: ");

		System.out.println("Nome: ");
		String nome = sc.next();

		System.out.println("Valor: ");
		double valor = sc.nextDouble();

		System.out.println("Quantidade: ");
		int quant = sc.nextInt();

		System.out.println("Descricao: ");
		String descricao = sc.next();

		System.out.println("Código de Barra: ");
		String codBarra = sc.nextLine();
		
		Produto prod = new Produto(nome,valor,quant,descricao,codBarra);
		lproduto.add(prod);
		System.out.println("nome: " + prod.nome);
		
		
		System.out.println("Digite as informações do produto: ");

		System.out.println("Nome: ");
		nome = sc.next();

		System.out.println("Valor: ");
		valor = sc.nextDouble();

		System.out.println("Quantidade: ");
		quant = sc.nextInt();

		System.out.println("Descricao: ");
		descricao = sc.next();

		System.out.println("Código de Barra: ");
		codBarra = sc.nextLine();
		
		prod = new Produto(nome,valor,quant,descricao,codBarra);
		lproduto.add(prod);
		
		
		for(Produto prd : lproduto){
			System.out.println(prd.nome);
		}
	}
}