package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		  System.out.println("Qual a categoria?");
	        System.out.println("1 para Informática");
	        System.out.println("2 para Telefonia");
	        int cate = entrada.nextInt();

	        System.out.println("Escolha o produto 1 a 3:");
	        int prod = entrada.nextInt();
	        
	        switch (cate) {
            case 1:
                switch (prod) {
                    case 1:
                        System.out.println("Categoria: Informática /Produto: Notebook");
                        break;
                    case 2:
                        System.out.println("Categoria: Informática / Produto: Mouse");
                        break;
                    case 3:
                        System.out.println("Categoria: Informática /Produto: Teclado");
                        break;
                    default: System.out.println("Produto inválido para Informática.");
                }
                break;

            case 2:
                switch (prod) {
                    case 1:
                        System.out.println("Categoria: Telefonia / Produto: Smartphone");
                        break;
                    case 2:
                        System.out.println("Categoria: Telefonia / Produto: Carregador");
                        break;
                    case 3:
                        System.out.println("Categoria: Telefonia / Produto: Fone de ouvido");
                        break;
                    default:
                        System.out.println("Produto inválido para Telefonia.");
                }
                break;

            default:
                System.out.println("Categoria inválida.");
        }


	}

}
