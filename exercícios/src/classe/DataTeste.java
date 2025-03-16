package classe;

public class DataTeste {
public static void main(String[] args) {
	Data d1 = new Data();
	d1.dia = 1;
	d1.mes = 10;
	d1.ano = 1933;
	Data d2 = new Data();
	d2.dia = 10;
	d2.mes = 11;
	d2.ano = 2034;
	Data d3 = new Data();
	Data d4 = new Data(5, 6, 2007);
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
	System.out.println(d3.dataFormatada());
	System.out.println(d4.dataFormatada());
}
}
