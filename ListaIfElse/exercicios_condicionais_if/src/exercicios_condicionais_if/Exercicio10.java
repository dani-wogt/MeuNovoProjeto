package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int temp;
		
		System.out.println("Informe a temperatuda em °C: ");
		temp = entrada.nextInt();
		
		if(temp>= 30) {
			System.out.println("Está calor!");
		}
		else {
			System.out.println("A temperatura está agradável!");
		}

	}

}
