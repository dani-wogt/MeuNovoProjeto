package Lista1Sc;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();

   
        int soma = num1+num2;
        int sub = num1-num2;
        int mult = num1*num2;
        double div = (double) num1/num2;
        int resto = num1%num2;

        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+sub);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Divisão: "+div);
        System.out.println("Resto da divisão: "+resto);
        
                          

	}

}
