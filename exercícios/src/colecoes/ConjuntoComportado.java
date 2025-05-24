package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class ConjuntoComportado {
	public static void main(String[] args) {
//		Set<String> listaAprovalos = new HashSet<>();
		SortedSet<String> listaAprovalos = new TreeSet<>();
		listaAprovalos.add("Ana");
		listaAprovalos.add("Carlos");
		listaAprovalos.add("Lucca");
		listaAprovalos.add("Pedro");

		for (String candidato : listaAprovalos) {
			System.out.println(candidato);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		for(int n: nums) {
			System.out.println(n);
		}

	}
}
