package br.edu.faeterj;
import java.util.*;

public class Calculadora {
	public double calculo(double v1, double v2, String opcao){
		double resultado = 0;
		switch(opcao) {
	      case "+":
	    	  resultado=v1 + v2;
	    	  break;
	      case "-":
	    	  resultado= v1 - v2;
	    	  break;
	      case "*":
	    	  resultado= v1 * v2;
	    	  break;
	      case "/":
	    	  resultado= v1 / v2;
	    	  break;
	    	  
	      case "sen":
	    	  double radianos = Math.toRadians(v1);
	    	  double seno= Math.sin(radianos);
	    	  resultado=seno;
	    	  break;
	    	  
	      case "cos":
	    	  double radianos1 = Math.toRadians(v1);
	    	  double cos = Math.cos(radianos1);
	    	  resultado=cos;
	    	  break;
	    	  
	      case "tan":
	    	  double radianos2 = Math.toRadians(v1);
	    	  double tan = Math.tan(radianos2);
	    	  resultado=tan;
	    	  break;
	    	
		}
		return resultado;
		
	}
}
