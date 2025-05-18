package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "vermelha";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o bassai-dai...");
		case "marrom":
			System.out.println("sei o tekki shodan");
		case "roxa":
			System.out.println("sei o heian godan");
		case "verde":
			System.out.println("sei o heian yodan");
		case "laranja":
			System.out.println("sei o heian sandan");
		case "vermelha":
			System.out.println("sei o heian nidan");
		case "amarela":
			System.out.println("sei o heian shodan");
//		default:
//			System.out.println("Não sei nada");
		}
		System.out.println("Fim");
	}
}
