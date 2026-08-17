package Lista1Sc;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a temperatura: ");
        double temp = scanner.nextDouble();
        
        String situacao = (temp>25) ? "Dia quente" : "Dia agradável";
        
        System.out.println("Temperatura: "+temp);
        System.out.println("Situação: "+situacao);

	}

}
