package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma das opções abaixo: ");
		System.out.println("1 para A");
		System.out.println("2 para B");
		System.out.println("3 para C");
		System.out.println("4 para D");
		System.out.println("6 para F");
		int letra = entrada.nextInt();
		
		switch(letra) {
		
		case 1:
			System.out.println("Excelente");
			break;
			
		case 2:
			System.out.println("Bom");
			break;
			
		case 3:
			System.out.println("Regular");
			break;
			
		case 4:
			System.out.println("Insuficiente");
			break;
			
		case 6:
			System.out.println("Reprovado");
			break;
			
			default: System.out.println("Conceito inválido!");
		}
		
		
		
		
	}

}
