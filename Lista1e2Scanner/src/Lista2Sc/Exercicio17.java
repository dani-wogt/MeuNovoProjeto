package Lista2Sc;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade em estoque: ");
        int estoque = scanner.nextInt();

        String status = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";
        
        System.out.println("Status do estoque: "+status);

	}

}
