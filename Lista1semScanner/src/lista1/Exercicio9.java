package lista1;

public class Exercicio9 {

	public static void main(String[] args) {
		
		boolean possuiIngresso = true;
		boolean possuiDocumento = false;
		boolean acompanhanteMaiorIdade = true;
		
		boolean n1 = possuiIngresso && possuiDocumento; 
        //false O operador && precisa que sejam verdadeiros, o possuiDocumento é falso, então o resultado é falso.

        boolean n2 = possuiIngresso || possuiDocumento; 
        //true  O operador || precisa que pelo menos um seja verdadeiro, possuiIngresso é verdadeiro, o resultado é verdadeiro.

        boolean n3 = !possuiDocumento; 
        //true  O operador !  inverte o valor booleano, o possuiDocumento é falso, sua negação é verdadeira.

        boolean n4 = possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade); 
        //true Primeiro resolve o parêntese e depois, true && true resulta em true.

        boolean n5 = !(possuiIngresso && possuiDocumento); 
        //true O parêntese (true && false) resulta em false, a negação !inverte esse false para true.
		

	}

}
