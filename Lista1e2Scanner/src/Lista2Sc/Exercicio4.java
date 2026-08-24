package Lista2Sc;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double soma = n1 + n2 + n3;
        double media = soma/3;

        System.out.println("Soma das notas: "+soma);
        System.out.println("Média final: "+media);

	}

}
