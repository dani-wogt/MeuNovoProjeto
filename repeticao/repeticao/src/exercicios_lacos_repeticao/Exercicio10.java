package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		 String nome;
	     double nota;
	     double soma = 0;
	     int totalA = 0;
	     char resposta;
	        
	     do {
	    	 System.out.print("Informe o nome do aluno: ");
	         nome = entrada.nextLine();
	        
	         System.out.print("Digite a nota do aluno: ");
	         nota = entrada.nextDouble();
	            
	          soma += nota;
	          totalA++;
	          
	          entrada.nextLine(); 
	           
	          System.out.print("Quer cadastrar outro aluno? (S/N): ");
	          resposta = entrada.nextLine().toUpperCase().charAt(0);
	            
	          System.out.println(); 

	        }while (resposta == 'S'); 

	        if (totalA >0){
	        	double media = soma/ totalA;
	            System.out.println("Total de alunos cadastrados: "+totalA);
	            System.out.printf("A média das notas informadas é:"+media);
	        } else {
	            System.out.println("Nenhum aluno foi cadastrado.");
	        }
	}

}
