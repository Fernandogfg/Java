package classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa marcio = new Pessoa("Marcio", 85.00);
		Comida feijoada = new Comida("Feijoada", 0.300);
		Comida Bife = new Comida("Bife", 0.200);
		marcio.comer(feijoada);
		marcio.comer(Bife);

	}
}
