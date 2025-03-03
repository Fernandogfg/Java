package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numericos com pontos flutuantes
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleano
		boolean estaDeFerias = false;//true
		
		//tipo caractere
		char status = 'A';//é possivel tambem utiliza valos da tabela unicode: \u0010
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: "+ status);
	}
}
