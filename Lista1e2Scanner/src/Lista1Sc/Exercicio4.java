package Lista1Sc;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1+nota2)/2;

  
        System.out.println("Aluno: "+nome);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Média: "+media);
                           
	}

}
