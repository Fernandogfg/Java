package fundamentos;

import java.util.Scanner;

//O desafio é receber 3 valores que representam salários e devolver a média, a parte "difícil"
//é que a pessoa pode informar tanto com virgula quanto com ponto.
public class DesafioConversao {
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
//captura dos salarios
		System.out.print("Informe o valor do primeiro salário: ");
		double sal1 = Double.parseDouble(valor.nextLine().replaceAll(",", "."));

		System.out.print("\nInforme o valor do segundo salário: ");
		double sal2 = Double.parseDouble(valor.nextLine().replaceAll(",", "."));

		System.out.print("\nInforme o valor do terceiro salário: ");
		double sal3 = Double.parseDouble(valor.nextLine().replaceAll(",", "."));
//calculo da média
		double media = (sal1 + sal2 + sal3)/3;
		
		System.out.printf("A média desses 3 salários é: R$ %.2f", media);
		valor.close();
	}
}
