package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println("Variável feita com double = " + a);
		var b = 4.5;
		System.out.println("Variável feita com var = " + b);
		var c = "'Texto'";
		System.out.println("Var do tipo string = " + c);
		double d;//variável foi declarada
		d = 123.65;//foi inicializada
		System.out.println(d);//foi usada
	}
}
