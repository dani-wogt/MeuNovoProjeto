package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		 System.out.print("Digite um número inteiro positivo: ");
	     int num = entrada.nextInt();
	     
	     int soma = 0;
	     
	     for(int i= 1; i<=num;i++) {
	    	 soma += i;
	    	 
	     } System.out.println("Soma: "+soma);

	}

}
