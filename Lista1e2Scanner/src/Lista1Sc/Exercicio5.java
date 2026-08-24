package Lista1Sc;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o preço do arroz: ");
        double arroz = scanner.nextDouble();
        
        System.out.print("Informe o preço do feijão: ");
        double feijao = scanner.nextDouble();
        
        System.out.print("Informe o preço do óleo: ");
        double oleo = scanner.nextDouble();
        
        double valorT = arroz+feijao+oleo;
        double valorM = valorT/3;

        System.out.println("Arroz: "+arroz);
        System.out.println("Feijão: "+feijao);
        System.out.println("Oleo: "+oleo);
        System.out.println("Valor Total: "+valorT);
        System.out.println("Media dos produtos: "+valorM);

	}

}
