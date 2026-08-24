package Lista2Sc;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o total de alunos: ");
        int total = scanner.nextInt();

        System.out.print("Digite a quantidade de grupos: ");
        int grupos = scanner.nextInt();

        int divInt = total/grupos;

       double divF = (double) total/grupos;

        System.out.println("Quantidade inteira (alunos por grupo): "+divInt);
        System.out.println("Resultado em ponto flutuante: " +divF);

	}

}
