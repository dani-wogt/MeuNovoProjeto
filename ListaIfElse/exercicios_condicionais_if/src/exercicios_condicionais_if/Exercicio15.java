package exercicios_condicionais_if;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double peso;
		double altura;
		
		System.out.println("Informe o peso da pessoa: ");
		peso = entrada.nextDouble();
		
		System.out.println("Informe a altura da pessoa: ");
		altura = entrada.nextDouble();
		
		double imc = peso/(altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Magreza / Abaixo do peso");
		}
		else if(imc >=18.5 && imc <=24.9) {
			System.out.println("Peso normal / Saudável");
		}
		else if(imc >= 25.0 && imc <= 29.9) {
			System.out.println("Sobrepeso (Pré-obesidade)");
		}
		else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		}
		else if(imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade Grau II");
		}
		else if(imc >= 40.0) {
			System.out.println("Obesidade Grau III (Grave))");
		}
		

	}

}
