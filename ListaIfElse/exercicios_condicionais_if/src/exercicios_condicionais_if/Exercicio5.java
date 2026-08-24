package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade do cliente: ");
		idade = entrada.nextInt();
		
		if(idade>=60) {
			System.out.println("Cliente possui direito ao desconto!");
		}

	}

}
