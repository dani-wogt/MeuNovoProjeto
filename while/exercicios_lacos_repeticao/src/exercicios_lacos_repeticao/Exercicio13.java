package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numero = entrada.nextInt();
        
        int cont = 1;
        
        System.out.println("Tabuada de " + numero + ":");
        
       while (cont <= 10) {
            int resultado = numero * cont;
            System.out.println(numero + " x " + cont + " = " + resultado);
            
            cont++;
        }

	}

}
