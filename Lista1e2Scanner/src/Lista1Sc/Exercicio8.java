package Lista1Sc;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
        int numA = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numB = scanner.nextInt();

        int divisaoInt = numA/numB;

        double divisaoFlut = (double) numA/numB;

        System.out.println("Divisão inteira: "+divisaoInt);
        System.out.println("Divisão em ponto flutuante: "+divisaoFlut);

	}

}
