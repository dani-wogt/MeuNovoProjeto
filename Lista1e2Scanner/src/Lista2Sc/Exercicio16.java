package Lista2Sc;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
        String funcionario = scanner.nextLine();

        System.out.print("Digite o cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();
        
        System.out.println("========================");
        System.out.println("Funcionário: "+funcionario);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+salario);
        System.out.println("========================");
                       

	}

}
