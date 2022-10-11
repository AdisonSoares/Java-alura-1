package Bytebank_herdado_conta.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = new String[5];
		List<Integer> numeros = new ArrayList<Integer>();
		
		int idade = 29;//Não aceita por ser primitivo e não ser referência
		Integer idadeRef = Integer.valueOf(29);
		
		numeros.add(idadeRef);
		numeros.add(29);//Autoboxing
		
		System.out.println(idadeRef.doubleValue());
	}
}
