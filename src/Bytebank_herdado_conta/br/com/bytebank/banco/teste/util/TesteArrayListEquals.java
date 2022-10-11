package Bytebank_herdado_conta.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
//		Conta contaCorrente1 = new ContaCorrente(22,22);
//		Conta contaCorrente2 = new ContaCorrente(22,22);
//		
//		boolean igualdade = contaCorrente1.igual(contaCorrente2);
//		System.out.println("Contas iguais? "+igualdade);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta contaCorrente1 = new ContaCorrente(22,11);
		Conta contaCorrente2 = new ContaCorrente(22,22);
		Conta contaCorrente3 = new ContaCorrente(22,22);

		lista.add(contaCorrente1);
		lista.add(contaCorrente2);
		
		boolean existe = lista.contains(contaCorrente3);
		
		System.out.println("Existe conta igual? "+existe);
		
		//boolean igualdade = contaCorrente1.igual(contaCorrente2);
		//System.out.println("Existe conta igual? "+igualdade);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
















