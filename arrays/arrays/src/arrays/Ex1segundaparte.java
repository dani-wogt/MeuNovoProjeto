package arrays;

public class Ex1segundaparte {

	public static void main(String[] args) {
		
		 double[][] notas = { 
		            {7.5, 8.0, 6.5, 9.0},
		            {6.0, 7.5, 8.0, 7.0}, 
		            {9.0, 8.5, 9.5, 10.0} 
		        }; 

		        char[] letras = {'A', 'B', 'C'}; 

		        for (int i = 0; i < notas.length; i++) { 
		            System.out.print(letras[i]+". Aluno "+(i+1)+": "); 
		            
		            for (int j = 0; j < notas[i].length; j++) { 
		                System.out.print(notas[i][j]+" "); 
		            } 
		            System.out.println(); 
		        } 
    
	}

}
