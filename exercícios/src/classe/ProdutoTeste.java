package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.89);
//		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		var p2 = new Produto();
//		p2.nome="Caneta preta";
		p2.preco = 12.56;
		
		System.out.println(p2.nome);
		System.out.println(p1.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		System.out.printf("Média do carrinho: R$%.2f.",mediaCarrinho);
	}
}
