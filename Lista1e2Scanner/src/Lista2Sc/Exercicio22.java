package Lista2Sc;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitário: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = scanner.nextInt();

         double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;

        System.out.println("Nome do produto: "+nomeProduto);
        System.out.println("Valor unitário do produto: "+valorUnitario);
        System.out.println("Quantidade de produtos comprados: "+quantidade);
        System.out.println("Valor total da compra: "+valorTotal);
        System.out.println("Quantidade de parcelas: "+parcelas);
        System.out.println("Valor de cada parcela: "+valorParcela);

	}

}
