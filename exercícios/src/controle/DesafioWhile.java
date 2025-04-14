package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double notasValidas = 0;
		int iteracoes = 0;

		System.out.println("Olá, digite as notas para começar, -1 para sair");
		double nota = entrada.nextDouble();
		while (nota != -1) {
			if (nota >= 0 && nota <= 10) {
				System.out.printf("Nota %.1f somada!", nota);
				notasValidas += nota;
				iteracoes++;
				nota = entrada.nextDouble();

			} else {
				System.out.println("Por favor digite um numero entre 0 e 10, ou -1 para sair");
				nota = entrada.nextDouble();
			}
		}
		System.out.printf(iteracoes != 0 ? "A média é: %.1f!" : "Nenhuma nota foi informada, sistema encerrado.",
				notasValidas / iteracoes);
		entrada.close();
	}
}
