package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
        int num = entrada.nextInt();
       
        for (int i=1;i<=10;i++) {
            int resul = num*i;
            
            System.out.println(num+" x "+i+" = " +resul);
        }
        

	}

}
