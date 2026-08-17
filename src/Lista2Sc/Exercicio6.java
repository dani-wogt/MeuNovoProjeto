package Lista2Sc;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Informe a distância em quilômetros: ");
        double quilometros = scanner.nextDouble();

        double metros = quilometros*1000;

        System.out.println("Distância em quilômetros: "+quilometros);
        System.out.println("Distância em metros: "+metros);

	}

}
