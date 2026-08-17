package Lista2Sc;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura: ");
        int temp = scanner.nextInt();

        System.out.println(temp> 25);
        System.out.println(temp<= 30);
        System.out.println(temp== 20);
        System.out.println(temp!= 30);

	}

}
