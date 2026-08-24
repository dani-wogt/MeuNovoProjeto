package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um número: ");
		num = entrada.nextInt();
		
		if(num % 5==0) {
			System.out.println("O número é múltiplo de 5");
		}

	}

}
