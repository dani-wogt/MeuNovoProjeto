package Lista2Sc;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        String situacao = (saldo > 0) ? "Saldo positivo" : "Saldo negativo";

        System.out.println("Saldo: "+saldo);
        System.out.println("Situação: "+situacao);

	}

}
