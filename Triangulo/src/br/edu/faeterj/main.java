package br.edu.faeterj;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		triangulo triX = new triangulo();
		
		
		System.out.println("Digite os lados do triangulo: X");
		triX.a = sc.nextDouble();
		triX.b = sc.nextDouble();
		triX.c = sc.nextDouble();
		
		double areaX = triX.CalculaArea();
		
		System.out.println("Area do triangulo X: " + areaX);
		
		triangulo triY = new triangulo();
		
		System.out.println("Digite os lados do triangulo: Y");
		triY.a = sc.nextDouble();
		triY.b = sc.nextDouble();
		triY.c = sc.nextDouble();
		
		double areaY = triY.CalculaArea();
		
		System.out.println("Area do triangulo Y: " + areaY);
		
	}

}
