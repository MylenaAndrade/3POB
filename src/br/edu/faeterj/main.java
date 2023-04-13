package br.edu.faeterj;
import java.util.Scanner;

public class main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
	    double valor1 = 0;
	    double valor2 = 0;
	    String opcao;
	    
		System.out.print("\t\tCALCULADORA SIMPLES \n[+]Soma \t\t[-]Subtracao \n[*]Multplicacao \t[/]Divisao\n[1]Seno \t\t[2]Cosseno\n[3]Tangente \n Digite a operacao: ");
	    opcao = sc.nextLine();
	    System.out.println("\nValor 1: ");
	    valor1 = sc.nextInt();
	    System.out.println("Valor 2: ");
	    valor2 = sc.nextInt();
	    
	    
	    double resultado = calc.calculo(valor1, valor2, opcao);
	    
	    System.out.println("\nO RESULTADO E: " + resultado);
	    sc.close();
	}

	

}
