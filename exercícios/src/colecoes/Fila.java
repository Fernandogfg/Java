package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila =new  LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		//diferença é o comportamente de quando a fila esta cheia;
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek());//Fila vazia vai retornar null
		System.out.println(fila.peek());
		System.out.println(fila.element());//Fila lança uma exceção
		System.out.println(fila.element());
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//retorna uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}
}
