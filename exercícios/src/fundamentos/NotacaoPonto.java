package fundamentos;

public class NotacaoPonto {
 public static void main(String[] args) {
	double a = 2.3;
	String s = "Bom dia X";
	s = s.replace("X", "Senhora");
	s = s.toUpperCase();
	s = s.concat("!!!");
	
	System.out.println(s);
	System.out.println("Fer".toUpperCase());
	
	String y = "Bom dia X"
			.replace("X", "Fer")
			.toUpperCase()
			.concat("!!!");
	System.out.println(y);
	
	//tipos primitivos não tem operador "."
	a = 3;
//	a.
	System.out.println(a);
}
}
