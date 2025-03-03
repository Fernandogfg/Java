package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//converte °F em °C
		// (°F-32)x 5/9 = °C
		double tempF = 86;
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		double tempC = (tempF - AJUSTE)*FATOR;
		System.out.println(tempC + "°C");
		
		tempF = 100;
		tempC = (tempF - AJUSTE)*FATOR;
		System.out.println(tempC + "°C");
		
	}
}
