package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha o setor:");
        System.out.println("1 para bebidas");
        System.out.println("2 para lanches");
        int setor = entrada.nextInt();

        switch (setor) {
            case 1:
                System.out.println("Escolha a bebida:");
                System.out.println("1 para água");
                System.out.println("2 para refrigerante");
                System.out.println("3 para suco");
                int bebida = entrada.nextInt();
                
                switch (bebida) {
                case 1:
                    System.out.println("Água");
                    break;
                case 2:
                    System.out.println("Refrigerante");
                    break;
                case 3:
                    System.out.println("Suco");
                    break;
                default: System.out.println("Bebida inválida!");
            }
            break;
            
            case 2: 
                System.out.println("Escolha o lanche:");
                System.out.println("1 para Cachorro-quente");
                System.out.println("2 para hambúrguer");
                System.out.println("3 para pizza");
                int lanche = entrada.nextInt();

                switch (lanche) {
                    case 1:
                        System.out.println("Cachorro-quente");
                        break;
                    case 2:
                        System.out.println("Hambúrguer");
                        break;
                    case 3:
                        System.out.println("Pizza");
                        break;
                    default: System.out.println("Lanche inválido!");
                }
                break;

            default:
                System.out.println("Setor inválido!");
        }


	}

}
