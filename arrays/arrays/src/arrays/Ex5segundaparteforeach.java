package arrays;

import java.util.Scanner;

public class Ex5segundaparteforeach {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] notas = new double[5][4];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as 4 notas do Aluno " + (i + 1) + ":");
            
            for (int j = 0; j < 4; j++) {
                System.out.print("Avaliação " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();
            }
            System.out.println();
        }
        
        System.out.println("Todas as Notas");
        int contadorAluno = 1;
        for (double[] aluno : notas) {
        	
            System.out.print("Aluno " + contadorAluno + ": ");
            
            for (double nota : aluno) {
            	 System.out.print(nota + " ");
            }
            System.out.println();
            contadorAluno++;
        }
        System.out.println();
        
        double somaNotasTurma = 0;
        int alunosAprovados = 0;
        int indiceMaiorMedia = 0;
        int indiceMenorMedia = 0;
        double maiorMedia = -1;
        double menorMedia = 11;
        
        System.out.println("Médias dos Alunos");
        
        for (int i = 0; i < 5; i++) {
            double somaAluno = 0;
            
            for (int j = 0; j < 4; j++) {
                somaAluno += notas[i][j];
            }
            double mediaAluno = somaAluno / 4;
            somaNotasTurma += mediaAluno;

            System.out.printf("Aluno %d - Média: %.1f%n", (i + 1), mediaAluno);

            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
                indiceMaiorMedia = i;
            }
            if (mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
                indiceMenorMedia = i;
            }
            if (mediaAluno >= 7.0) {
                alunosAprovados++;
            }
        }
        
        double mediaTurma = somaNotasTurma/5;

        System.out.println("\n--- Resultados Finais ---");
        System.out.printf("Maior média: Aluno %d - %.1f%n", (indiceMaiorMedia+1), maiorMedia);
        System.out.printf("Menor média: Aluno %d - %.1f%n", (indiceMenorMedia+1), menorMedia);
        System.out.printf("Média da turma: %.2f%n", mediaTurma);
        System.out.println("Alunos aprovados: "+alunosAprovados);

	}

}
