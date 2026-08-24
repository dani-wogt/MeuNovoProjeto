package Lista1Sc;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o curso: ");
        String curso = scanner.nextLine();

        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();


        System.out.println("==============================");
        System.out.println("Aluno: "+nome);
        System.out.println("Curso"+curso);
        System.out.println("Idade: "+idade);
        System.out.println("==============================");
                       

	}

}
