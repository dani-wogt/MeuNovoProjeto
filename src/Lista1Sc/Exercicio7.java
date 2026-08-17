package Lista1Sc;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double salario = 3875.90;
        
        int salarioInt = (int) salario; 
        double salarioDouble = (double) salarioInt;

        System.out.println("Salário original (double): " + salario);
        System.out.println("Parte inteira (int): " + salarioInt);
        System.out.println("Convertido novamente (double): " + salarioDouble);
        
        

	}

}
