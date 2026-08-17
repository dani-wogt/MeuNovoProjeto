package Lista2Sc;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura: ");
        double tempInicial = scanner.nextDouble();
        
        int tempInt = (int) tempInicial;

        double tempD = (double) tempInt;

         System.out.println("Temperatura inicial (double): "+tempInicial);
        System.out.println("Temperatura convertida para int: "+tempInt);
        System.out.println("Temperatura reconvertida para double: "+tempD);

	}

}
