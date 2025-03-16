package classe;

public class Data {
	int dia;
	int mes;
	int ano;

	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	Data() {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
