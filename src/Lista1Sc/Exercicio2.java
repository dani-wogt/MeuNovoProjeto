package Lista1Sc;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Informe a quantidade em estoque: ");
        int quantEst = scanner.nextInt();

        
       System.out.println("Produto: "+nome); 
       System.out.println("Codigo: "+codigo); 
       System.out.println("Preço: "+preco); 
       System.out.println("Quantidade em estoque: "+quantEst); 
                          
	}

}
