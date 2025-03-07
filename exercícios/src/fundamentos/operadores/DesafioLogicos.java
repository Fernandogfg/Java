package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trab na terça
		// trab na quinta
		boolean trabTer = false;
		boolean trabQuin = false;
		
		System.out.println("Compramos a TV de 50? " + (trabTer && trabQuin));
		System.out.println("Compramos a TV de 32? " + (trabTer ^ trabQuin)); 
		System.out.println("Vamos tomar sorvete? " + (trabTer || trabQuin));
		System.out.println("Vamos ficar em casa saudáveis? " + (!(trabTer || trabQuin)) );
	}
}
