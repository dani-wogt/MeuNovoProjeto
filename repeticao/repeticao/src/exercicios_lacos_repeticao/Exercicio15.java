package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        double soma = 0;
        
        for (int i= 1;i<=5;i++) {
            System.out.print("Digite a nota "+i+": ");
            double nota = entrada.nextDouble();
           
            soma += nota; 
        }
        double media = soma / 5;
      
        System.out.println("Soma das notas: "+soma);
        System.out.println("Média das notas: "+media);

	}

}
