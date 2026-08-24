package Lista1Sc;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double cotDolar = 5.62;
		
		System.out.print("Informe valor do monitor em dólares: ");
        double valorDo = scanner.nextDouble();
        
        double valorR = valorDo*cotDolar;
        
        System.out.printf("O monitor custa em reais: "+valorR);

	}

}
