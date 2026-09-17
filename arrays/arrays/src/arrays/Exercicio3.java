package arrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] alunos = {
			"Danieli", "Jordana", "Eloisa", "Helena", "Maria", "Natalia", "Matheus", "Joao"};
		
		 System.out.print("Digite o nome do aluno que quer encontrar: ");
	        String nome = entrada.nextLine();

	        boolean encontrado = false;
	        int pos = -1;
	        
	        for (int i = 0; i < alunos.length; i++) {
	            
	            if (alunos[i].equalsIgnoreCase(nome)) {
	                encontrado = true;
	                pos = i; 
	                break;
	            }
	        }
	        if (encontrado) {
	            System.out.println("O aluno(a) foi encontrado na posição: "+pos);
	        } else {
	            System.out.println("Aluno não foi encontrado.");
	        }

			
		}
		
		
        

	}


