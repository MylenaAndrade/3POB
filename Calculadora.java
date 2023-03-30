import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double valor1 = 0;
    double valor2 = 0;
    double result = 0;
    String opcao;

    System.out.print("\t\tCALCULADORA SIMPLES \n[+]Soma \t\t[-]Subtracao \n[*]Multplicacao [/]Divisao\n Digite a operacao: ");
    opcao = sc.nextLine();
    System.out.println("\nValor 1: ");
    valor1 = sc.nextInt();
    System.out.println("Valor 2: ");
    valor2 = sc.nextInt();

    switch(opcao){
      case "+":
        result= valor1 + valor2;
        break;
      case "-":
        result= valor1 - valor2;
        break;
      case "*":
        result= valor1 * valor2;
        break;
      case "/":
        result= valor1 / valor2;
        break;  
    }

    System.out.println("\nO RESULTADO E: " + result);
    sc.close();

  
  }
}

