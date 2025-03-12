package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(10);
//	a.pi = 10;
		AreaCirc b = new AreaCirc(5);
//	b.pi = 100;
		
		AreaCirc.pi = 3.1415;
		System.out.println(a.area());
		System.out.println(b.area());
		System.out.println(AreaCirc.pi);
		System.out.println(Math.PI);
	}
}
