package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		//if(...){;}
		//while(...) sentença
		//for(...;...;...){}
		
		//do{} while(...);
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras magicas");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
			
		} while(!texto.equalsIgnoreCase("Por favor"));
		System.out.println("Parabéns você saiu :)");
		entrada.close();
	}
}
