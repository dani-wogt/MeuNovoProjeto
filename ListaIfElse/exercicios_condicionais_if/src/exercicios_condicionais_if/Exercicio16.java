package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double media;
		System.out.println("Informe a média do aluno: ");
		media = entrada.nextDouble();
		
		if(media>= 7.0) {
			System.out.println("Aluno aprovado!");
		}
		if(media>= 9.5) {
			System.out.println("Aluno aprovado com distinção!");
		}

	}

}
