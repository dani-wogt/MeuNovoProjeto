package Lista2Sc;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Está chovendo? (true/false): ");
        boolean chovendo = scanner.nextBoolean();

        System.out.print("Tem guarda-chuva? (true/false): ");
        boolean guardaChuva = scanner.nextBoolean();

        System.out.print("Tem carro disponível? (true/false): ");
        boolean carroDisponivel = scanner.nextBoolean();

        //false (AND '&&' exige que os dois sejam verdadeiros: true && false = false)
        System.out.println("chovendo && guardaChuva: " + (chovendo && guardaChuva));

        //true (OR '||' precisa de apenas um verdadeiro: false || true = true)
        System.out.println("guardaChuva || carroDisponivel: " + (guardaChuva || carroDisponivel));

        //false (NOT '!' inverte o valor: !true = false)
        System.out.println("!chovendo: " + (!chovendo));

        //true (Parênteses primeiro: false || true = true. Depois: true && true = true)
        System.out.println("chovendo && (guardaChuva || carroDisponivel): " + (chovendo && (guardaChuva || carroDisponivel)));

        //true (Dentro do parênteses dá false. O '!' inverte o resultado: !false = true)
        System.out.println("!(chovendo && guardaChuva): " + (!(chovendo && guardaChuva)));

	}

}
