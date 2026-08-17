package Lista2Sc;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Informe a distância percorrida em km: ");
        double dist = scanner.nextDouble();

        System.out.print("Informee o combustível consumido em litros: ");
        double litros = scanner.nextDouble();

        double consumoM = dist/litros;
        double l100 = 100/consumoM;

        System.out.println("Distância percorrida: "+dist);
        System.out.println("Litros consumidos: " + litros);
        System.out.println("Consumo médio: " +consumoM);
        System.out.println("Litros necessários para percorrer 100 km: "+l100);

	}

}
