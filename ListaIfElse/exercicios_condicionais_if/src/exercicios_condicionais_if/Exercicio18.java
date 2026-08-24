package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double media;
		int freq;
		
		System.out.println("Informe a media: ");
		media = entrada.nextDouble();
		
		System.out.println("Informe a % de frequencia: ");
		freq = entrada.nextInt();
		
		if(media>= 7 && freq >=75) {
			System.out.println("Aluno aprovado");
		}
		if(media >=9.5 && freq >=75) {
			System.out.println("Aluno aprovado com mérito");
		}
		
	}

}
