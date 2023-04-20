package br.edu.faeterj;

public class triangulo {
	public double a, b, c;
	
	public double CalculaArea(){
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
