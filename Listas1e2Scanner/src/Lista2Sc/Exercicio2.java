package Lista2Sc;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o ano de fabricação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite a cor do veículo: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o valor do veículo: ");
        double valor = scanner.nextDouble();

        System.out.print("O veículo é automático? (true/false): ");
        boolean aut = scanner.nextBoolean();
        
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
        System.out.println("Valor: "+valor);
        System.out.println("Automatico: "+aut);
                          
     
	}

}
