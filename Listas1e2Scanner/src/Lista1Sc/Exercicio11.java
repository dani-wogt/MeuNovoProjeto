package Lista1Sc;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a nota: ");
        int nota = scanner.nextInt();

        System.out.print("Digite a frequência: ");
        int frequencia = scanner.nextInt();

        String situacao = (nota >= 6 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: "+nomeAluno);
        System.out.println("Situação: "+situacao);
	}

}
