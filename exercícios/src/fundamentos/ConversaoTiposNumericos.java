package fundamentos;

public class ConversaoTiposNumericos {
public static void main(String[] args) {
	
	double a = 1;//conversão implícita.
	System.out.println(a);
	
	float b = (float) 1.1234567888888;//explícita (Cast)
	System.out.println(b);
	
	int c = 340;
	byte d = (byte)c;//explícita (Cast)
	System.out.println(d);
	
	double e = 1.0;
	int f = (int)e;
	System.out.println(f);
}
}
