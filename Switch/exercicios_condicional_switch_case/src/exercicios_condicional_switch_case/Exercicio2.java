package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Informe outro número: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Qual operação deseja?");
		System.out.println("1 para soma");
		System.out.println("2 para subtração");
		System.out.println("3 para multiplicação");
		System.out.println("4 para divisão");
		
		int op = entrada.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("Soma dos números: "+(num1+num2));
			break;
			
		case 2:
			System.out.println("Subtração dos números: "+(num1-num2));
			break;
			
		case 3:
			System.out.println("Multiplicação dos números: "+(num1*num2));
			break;
			
		case 4:
			System.out.println("Divisão dos números: "+(num1/num2));
			break;
			
			default: 
				System.out.println("Opção inválida!");
		
		}

	}

}
