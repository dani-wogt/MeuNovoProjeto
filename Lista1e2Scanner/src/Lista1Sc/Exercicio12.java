package Lista1Sc;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();

        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("Resultado: "+resultado);

	}

}
