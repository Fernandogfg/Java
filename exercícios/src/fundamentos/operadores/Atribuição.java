package fundamentos.operadores;

public class Atribuição {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		c += b;// c = c + b;
		c -= b;// c = c - b;
		c *= b;// c = c * b;
		c /= b;// c = c * b;
		c %= 2;// c = c % 2; 1 ou 0
		System.out.println(a);
		System.out.println(c);
	}
}
