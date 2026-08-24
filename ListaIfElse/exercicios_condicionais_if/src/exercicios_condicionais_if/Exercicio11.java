package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double media;
		System.out.println("Informe a média do aluno: ");
		media = entrada.nextDouble();
		
		if(media>= 9.0) {
			System.out.println("A");
		}
		else if(media>= 7.0) {
			System.out.println("B");
		}
		else if(media>=5.0) {
			System.out.println("C");
		}
		else if(media< 5.0) {
			System.out.println("D");
		}

	}

}
