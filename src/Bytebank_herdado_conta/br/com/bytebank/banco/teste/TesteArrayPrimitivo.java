package Bytebank_herdado_conta.br.com.bytebank.banco.teste;

import java.util.Iterator;

public class TesteArrayPrimitivo {

	public static void main(String[] args) {
		int[] idades = new int[5];
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 49;
//		idades[3] = 59;
//		idades[4] = 69;
		
		int idade = idades[2];
		System.out.println(idade);
		System.out.println(idades.length);
		
		for (int i = 0; i < idades.length; i++) {
			int idadeFixa = 29;
			idades[i] += idadeFixa + (i * 10); 
		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
}
