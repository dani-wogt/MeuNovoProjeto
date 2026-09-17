package arrays;

public class Ex2segundaparte {

	public static void main(String[] args) {
		
		 int[][] matriz = {
		            {12, 5, 8, 23},
		            {17, 40, 2, 11},
		            {9, 15, 34, 7},
		            {21, 3, 19, 88}
		        };

		        int soma = 0;
		        int maior = matriz[0][0];
		        int menor = matriz[0][0];
		        int totalElementos = 0;

		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                int valorAtual = matriz[i][j];
		                
		                soma += valorAtual;
		                totalElementos++; 
		               if (valorAtual > maior) {
		                    maior = valorAtual;
		                }
		              
		               if (valorAtual <menor) {
		                    menor = valorAtual;
		                }
		            }
		        }

		        double media = (double) soma / totalElementos;

		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                System.out.print(matriz[i][j] + "\t");
		            }
		            System.out.println(); 
		        }
		        
		        System.out.println("Soma de todos os elementos: "+soma);
		        System.out.println("Média dos elementos: "+media);
		        System.out.println("Maior elemento: "+maior);
		        System.out.println("Menor elemento: "+menor);
	}

}
