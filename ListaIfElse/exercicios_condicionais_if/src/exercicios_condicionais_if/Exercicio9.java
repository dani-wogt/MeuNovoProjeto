package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Informe o primeiro numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		num2 = entrada.nextInt();
		
		if(num1>num2) {
			System.out.println("O primeiro número é maior");
		}
		else {
			System.out.println("O segundo número é maior");
		}

	}

}
