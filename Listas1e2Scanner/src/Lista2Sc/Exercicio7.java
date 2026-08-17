package Lista2Sc;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Digite a nota: ");
        double notaInicial = scanner.nextDouble();

        int notaInteira = (int) notaInicial;
  
        double notaDouble = (double) notaInteira;

        System.out.println("Valor inicial (double): "+notaInicial);
        System.out.println("Valor convertido em double: "+notaDouble);
        System.out.println("Valor em double convertido em int: "+(int)notaDouble);

	}

}
