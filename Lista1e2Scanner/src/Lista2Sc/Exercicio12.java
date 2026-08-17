package Lista2Sc;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println(saldo>=1000);
        System.out.println(saldo<500);
        System.out.println(saldo==850);
        System.out.println(saldo!=850);
        System.out.println(saldo>100);

	}

}
