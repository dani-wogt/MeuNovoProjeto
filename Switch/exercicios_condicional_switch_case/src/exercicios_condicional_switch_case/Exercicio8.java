package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número da sala 1 ou 2: ");
        int sala = entrada.nextInt();

        System.out.print("Digite o número do filme 1 a 3: ");
        int filme = entrada.nextInt();

        switch (sala) {
            case 1:
                switch (filme) {
                    case 1:
                        System.out.println("Filme: Aventura");
                        break;
                    case 2:
                        System.out.println("Filme: Comédia");
                        break;
                    case 3:
                        System.out.println("Filme: Ficção Científica");
                        break;
                    default:
                        System.out.println("Número de filme inválido para a Sala 1.");
                }
                break;

            case 2:
                switch (filme) {
                    case 1:
                        System.out.println("Filme: Terror");
                        break;
                    case 2:
                        System.out.println("Filme: Romance");
                        break;
                    case 3:
                        System.out.println("Filme: Animação");
                        break;
                    default:
                        System.out.println("Número de filme inválido para a Sala 2.");
                }
                break;

            default:
                System.out.println("Sala inválida");
        }

	}

}
