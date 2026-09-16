package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número de início: ");
        int inicio = entrada.nextInt();
        
        System.out.print("Digite o número final: ");
        int fim = entrada.nextInt();
        
        if (inicio>fim) {
            System.out.println("O número do início deve ser menor ou igual o número final.");
        } 
        else {
        	int atual = inicio;
            do{
                System.out.println(atual);
                atual++;
                
            }while (atual <= fim);
        }
			
			
		

	}

}
