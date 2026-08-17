package Lista2Sc;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a média do aluno: ");
        double media = scanner.nextDouble();

        String situacao = (media>=7.0) ? "Aprovado" : "Reprovado";

        System.out.println("Situação do aluno: "+situacao);

	}

}
