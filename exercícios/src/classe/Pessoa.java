package classe;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	void comer(Comida c) {
	peso += c.peso;
		System.out.printf("%s comeu %s e agora esta pesando %.1fKg\n", nome, c.nome, peso);
	}
}
