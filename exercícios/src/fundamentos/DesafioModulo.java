package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		Double num1 = Double.parseDouble(entrada.next());

		System.out.print("Digite o segundo número: ");
		Double num2 = Double.parseDouble(entrada.next());

		System.out.print("Digite o símbolo da operação que deseja realizar: ");
		String operador = entrada.next();

		var resultado = operador.equals("+") ? num1 + num2
				: operador.equals("-") ? num1 - num2
						: operador.equals("*") ? num1 * num2
								: operador.equals("/") ? num1 / num2
										: operador.equals("%") ? num1 % num2
												: "Desculpe mas não foi possível realizar a operação";

		System.out.println(resultado);
		entrada.close();
	}
}
