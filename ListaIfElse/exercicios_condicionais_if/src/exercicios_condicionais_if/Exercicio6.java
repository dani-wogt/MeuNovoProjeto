package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um número: ");
		num = entrada.nextInt();
		
		if(num %2 == 0) {
			System.out.println("Número par!");
		}
		else {
			System.out.println("Número Impar");
		}
		

	}

}
