package Lista1Sc;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Informe o tempo de empresa: ");
        int tempoEmpresa = scanner.nextInt();

        double bonus = (tempoEmpresa >= 5) ? 500.0 : 0.0;

        double salarioFinal = salario + bonus;

        System.out.println("Nome: "+nome); 
        System.out.println("Salário: "+salario); 
        System.out.println("Bônus: "+bonus); 
        System.out.println("Salário Final: "+salarioFinal); 
                

	}

}
