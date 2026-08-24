package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade do atleta: ");
		idade = entrada.nextInt();
		
		if(idade<= 12) {
			System.out.println("Infantil");
		}
		else if(idade>=13&&idade <= 17) {
			System.out.println("Juvenil");
		}
		else if(idade >= 18 && idade <= 39) {
			System.out.println("Adulto");
		}
		else{
			System.out.println("Master");
			}

	}
	}
