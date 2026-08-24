package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade da pessoa: ");
		idade = entrada.nextInt();
		
		if(idade<= 12) {
			System.out.println("Criança");
		}
		else if(idade>=13&&idade <= 17) {
			System.out.println("Adolescente");
		}
		else if(idade >= 18 && idade <= 59) {
			System.out.println("Adulto");
		}
		else{
			System.out.println("Idoso");
		}

	}

}
