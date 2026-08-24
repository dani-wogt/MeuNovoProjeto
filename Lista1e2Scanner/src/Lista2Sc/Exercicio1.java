package Lista2Sc;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
		System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();
        
		System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a média final: ");
        double mediaFinal = scanner.nextDouble();

        System.out.print("Está matriculado? (true/false): ");
        boolean estaMatriculado = scanner.nextBoolean();

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Curso: "+curso);
        System.out.println("Altura: "+altura);
        System.out.println("Média final: "+mediaFinal);
        System.out.println("Esta matriculado: : "+estaMatriculado);
                          

	}

}
