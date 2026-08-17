package Lista2Sc;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = scanner.nextInt();

        int divInt = x/y;

         double divFlut = (double) x/y;

         System.out.println("Divisão inteira: "+divInt);
        System.out.println("Divisão em ponto flutuante: "+divFlut);

	}

}
