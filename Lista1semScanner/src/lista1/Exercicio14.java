package lista1;

public class Exercicio14 {

	public static void main(String[] args) {
		
		String nome = "Danieli";
        double sal = 5000.00;
        int tempoEmp = 6;

        double bonus = (tempoEmp>=5) ? 500.00 : 0.00;
        double salarioFinal = sal+bonus;

        System.out.println("Nome: "+nome);
        System.out.println("Salário: R$ "+sal);
        System.out.println("Bônus: R$ "+bonus);
        System.out.println("Salário Final: "+salarioFinal);

	}

}
