package fundamentos.operadores;

public class DesafioAritimetica {
	public static void main(String[] args) {
		double a = Math.pow(6*(3+2), 2);
		double b = a / (3*2);
		double c = Math.pow((1-5)*(2-7)/2, 2);
		double d = Math.pow(10, 3);
		double e = Math.pow((b-c),3);
		double f = e / d;
		System.out.println(f);
	}
}
