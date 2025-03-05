package fundamentos;

public class Wrappers {
 public static void main(String[] args) {
	//byte
	 Byte b = 100;
	 Short s = 1000;
	 Integer i = 10_000;
	 Long l = 100_000L;
	 
	 System.out.println(b.byteValue());
	 System.out.println(s.toString());
	 System.out.println(i*3);
	 System.out.println(l/3);
	 
	 Float f = 123.10F;
	 System.out.println(f);
	 Double d = 123.456789;
	 System.out.println(d);
	 
	 Boolean bo = Boolean.parseBoolean("true");
	 System.out.println(bo);
	 System.out.println(bo.toString().toUpperCase());
	 
	 Character c = '#';
	 System.out.println(c);
}
}
