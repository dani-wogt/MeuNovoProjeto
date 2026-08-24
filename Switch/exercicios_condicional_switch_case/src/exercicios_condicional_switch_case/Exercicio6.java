package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o turno:");
        System.out.println("1 para Manhã");
        System.out.println("2 para Tarde");
        System.out.print("Informe o código do turno: ");
        int turno = entrada.nextInt();
        
        System.out.print("Digite o código da disciplina 1, 2 ou 3: ");
        int dis = entrada.nextInt();
        
        switch (turno) {
        
        case 1:
            switch (dis) {
            case 1:
            	 System.out.println("Turno:Manhã| Disciplina:Matemática");
              	 break;
            case 2:
            	System.out.println("Turno: Manhã| Disciplina: Português");
	         	break;
         	case 3:
         		System.out.println("Turno: Manhã| Disciplina: Física");
                    break;
         	default: System.out.println("Código inválido para manhã.");
                    break;
            }
            break;

        	case 2:
            switch (dis) {
                case 1:
                    System.out.println("Turno: Tarde | Disciplina:História");
                    break;
                case 2:
                    System.out.println("Turno:Tarde | Disciplina: Geografia");
                    break;
                case 3:
                    System.out.println("Turno: Tarde| Disciplina: Biologia");
                    break;
                default:
                    System.out.println("Código inválido para tarde.");
                    break;
            }
            break;

        	default: System.out.println("Código de turno inválido.");
            break;
        }

	}

}
