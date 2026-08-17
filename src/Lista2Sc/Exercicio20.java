package Lista2Sc;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        String tipoAtendimento = (idade >= 60) ? "Atendimento preferencial" : "Atendimento comum";

        System.out.println("Idade: "+idade);
        System.out.println("Tipo de atendimento: "+tipoAtendimento);

	}

}
