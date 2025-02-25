package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.print("bom");
		System.out.print(" dia!\n");
		System.out.println("bom");
		System.out.println("dia!");
		System.out.printf("Megasena: %d %d %d %d %d %d %n",1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("\nInforme sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("%s %s tem %d anos de idade",nome, sobrenome, idade);
		entrada.close();
	}
}
