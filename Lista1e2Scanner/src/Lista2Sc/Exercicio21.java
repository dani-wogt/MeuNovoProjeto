package Lista2Sc;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();

         double valorPorHoraExtra = 35.00;

        double valorHorasExtras = horasExtras * valorPorHoraExtra;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("Nome: "+nome);
        System.out.println("Salário base: "+salarioBase);
        System.out.println("Valor das horas extras: "+valorHorasExtras);
        System.out.println("Salário final: "+salarioFinal);

	}

}
