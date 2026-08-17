package Lista2Sc;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o produto: ");
        String produto = scanner.nextLine();

        System.out.print("Informe o preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Informee o estoque: ");
        int estoque = scanner.nextInt();

        System.out.println("========================");
        System.out.println("Produto: "+produto);
        System.out.println("Preço: "+preco);
        System.out.println("Estoque: "+estoque);
        System.out.println("========================");
                       

	}

}
