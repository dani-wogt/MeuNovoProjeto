package Lista1Sc;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe o peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Matrícula ativa: (true/false): ");
        boolean matAt = scanner.nextBoolean();
        
        System.out.println("Nome: "+nome);
        System.out.println ("Idade: "+idade);
        System.out.println ("Altura: "+altura);
        System.out.println ("Peso: "+peso);
        System.out.println ("Sexo: "+sexo);
        System.out.println ("Matrícula Ativa: "+matAt);
            
             
	}

}
