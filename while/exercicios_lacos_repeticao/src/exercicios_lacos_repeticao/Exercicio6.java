package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Informe um numero de inicio: ");
			int numI = entrada.nextInt();
			
			System.out.println("Informe um numero de final: ");
			int numF = entrada.nextInt();
			
			System.out.println("Numeros de "+numI+" até "+numF);
			
			while(numI<=numF) {
				System.out.println(numI);
				numI++;
			}
			
			
		

	}

}
