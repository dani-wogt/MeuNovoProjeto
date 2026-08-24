package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade da pessoa: ");
		idade = entrada.nextInt(); 
		
		 if(idade>=18) {
			 System.out.println("Maior de idade!");
		 }
		 else {
			 System.out.println("Menor de idade!");
		 }

	}

}
