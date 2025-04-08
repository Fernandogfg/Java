package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// Domingo -> 1
		// Quarta -> 4
		// terça -> 3
		Scanner entrada = new Scanner(System.in);
		System.out.println("");
		String dia = entrada.nextLine();
		if (dia.equals("dom")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("seg")) {
			System.out.println("2");
		} else if (dia.equalsIgnoreCase("ter")) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase("qua")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("qui")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("sex")) {
			System.out.println("6");
		} else {
			System.out.println("7");
		}
		entrada.close();
	}
}
