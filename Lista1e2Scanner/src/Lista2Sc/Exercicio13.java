package Lista2Sc;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Possui CNH? (true/false: ");
        boolean possuiCNH = scanner.nextBoolean();

        System.out.print("Possui Carro? (true/false: ");
        boolean possuiCarro = scanner.nextBoolean();

        System.out.print("Possui Dinheiro? (true/false: ");
        boolean possuiDinheiro = scanner.nextBoolean();

        //FALSE: O operador AND (&&) exige que AMBAS as condições sejam verdadeiras
        System.out.println("possuiCNH && possuiCarro: " + (possuiCNH && possuiCarro));

        //TRUE: O operador OR (||) precisa de apenas UMA condição verdadeira
        System.out.println("possuiCarro || possuiDinheiro: " + (possuiCarro || possuiDinheiro));

        //FALSE: O operador NOT (!) inverte o valor booleano
        System.out.println("!possuiCNH: " + (!possuiCNH));

        //TRUE: Ambos os operandos são verdadeiros (true && true)
         System.out.println("possuiCNH && possuiDinheiro: " + (possuiCNH && possuiDinheiro));

        //FALSE: A expressão entre parênteses (possuiCarro || possuiDinheiro)
        // TRUE (false || true). O operador NOT (!) inverte essa expressão
        // (!true), resultando em false.
        System.out.println("!(possuiCarro || possuiDinheiro): " + (!(possuiCarro || possuiDinheiro)));

	}

}
