package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int nota;
		System.out.println("Informe uma nota de 0 a 100: ");
		nota = entrada.nextInt();
		
		if(nota >= 90) {
			System.out.println("Excelente");
		}
		else if(nota >= 70) {
			System.out.println("Bom");
		}
		else if(nota>= 50) {
			System.out.println("Regular");
		}
		else if(nota < 50) {
			System.out.println("Insuficiente");
		}

	}

}
