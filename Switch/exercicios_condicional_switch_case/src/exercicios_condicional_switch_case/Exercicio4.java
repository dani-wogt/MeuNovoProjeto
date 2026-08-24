package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o código do produto");
		System.out.println("1 para cachorro-quente");
		System.out.println("2 para hambúrguer");
		System.out.println("3 para pizza");
		System.out.println("4 para refrigerante");
		System.out.println("5 para suco");
		int cd = entrada.nextInt();
		
		switch(cd) {
		
		case 1:
			System.out.println("Cachorro quente");
			break;
			
		case 2:
			System.out.println("Hambúrguer");
			break;
			
		case 3:
			System.out.println("Pizza");
			break;
			
		case 4:
			System.out.println("Refrigerante");
			break;
			
		case 5:
			System.out.println("Suco");
			break;
			
			default: 
				System.out.println("Produto inválido!");
		
		}

	}

}
