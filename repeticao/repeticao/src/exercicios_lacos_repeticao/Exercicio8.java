package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		int cont = 1;
		int num;
		
		 do{
			 System.out.print("Digite o "+cont+" número: ");
	            num = entrada.nextInt();
	            
	            soma += num;
	            cont++;
	            
	        }while (cont <=5);
	       
		 System.out.println("A soma de todos os números é: "+soma);
	        

	}

}
