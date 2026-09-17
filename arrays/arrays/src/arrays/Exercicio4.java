package arrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		 int[] numeros = new int[15];
	        
	        int par = 0;
	        int impar = 0;
	        int maiorQ10 = 0;
	        int menorIgual10 = 0;
	        
	        System.out.println("Digite 15 números inteiros:");
	        for (int i = 0; i < numeros.length; i++) {
	        	
	        	System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = entrada.nextInt();
	        }
	        for (int i = 0; i < numeros.length; i++) {
	            int num = numeros[i];
	            
	           if (num%2==0) {
	                par++;
	            } else {
	                impar++;
	            }
	            if (num>10) {
	                maiorQ10++;
	            } else {
	                menorIgual10++;
	            }
	        }
	        System.out.println("Quantidade de pares: "+par);
	        System.out.println("Quantidade de impares: "+impar);
	        System.out.println("Maiores que 10: "+maiorQ10);
	        System.out.println("Mneores ou iguais a 10: "+menorIgual10);

	}

}
