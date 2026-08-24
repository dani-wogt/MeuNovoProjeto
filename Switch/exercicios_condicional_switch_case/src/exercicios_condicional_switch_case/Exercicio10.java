package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o código do curso: ");
		System.out.println("1 para Informática");
		System.out.println("2 para Administração");
		System.out.println("3 para Engenharia");
        int curso = entrada.nextInt();

        System.out.print("Digite o código da disciplina 1 a 3: ");
        int disc = entrada.nextInt();

        switch (curso) {
            case 1:
                switch (disc) {
                    case 1:
                        System.out.println("Curso: Informática / Disciplina: Programação");
                        break;
                    case 2:
                        System.out.println("Curso: Informática / Disciplina: Banco de Dados");
                        break;
                    case 3:
                        System.out.println("Curso: Informática/ Disciplina: Redes");
                        break;
                    default:
                        System.out.println("Disciplina inválida para Informática.");
                }
                break;
                
            case 2:
                switch (disc) {
                    case 1:
                        System.out.println("Curso: Administração /Disciplina: Marketing");
                        break;
                    case 2:
                        System.out.println("Curso: Administração/ Disciplina: Economia");
                        break;
                    case 3:
                        System.out.println("Curso: Administração / Disciplina: Contabilidade");
                        break;
                    default:
                        System.out.println("Disciplina inválida para Administração.");
                }
                break;

            case 3: 
                switch (disc) {
                    case 1:
                        System.out.println("Curso: Engenharia / Disciplina: Cálculo");
                        break;
                    case 2:
                        System.out.println("Curso: Engenharia/Disciplina: Física");
                        break;
                    case 3:
                        System.out.println("Curso: Engenharia / Disciplina: Desenho Técnico");
                        break;
                    default:
                        System.out.println("Disciplina inválida para Engenharia.");
                }
                break;

            default:
                System.out.println("Código de curso inválido.");
        }

	}

}
