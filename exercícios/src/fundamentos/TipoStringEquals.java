package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		String s = new String("2");
		String a = "t";
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("t" == a.trim());
		System.out.println("2".equals(s2.trim()));
		entrada.close();
	}
}
