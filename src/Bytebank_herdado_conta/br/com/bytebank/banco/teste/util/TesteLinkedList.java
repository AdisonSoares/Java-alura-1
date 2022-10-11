package Bytebank_herdado_conta.br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		List<Conta> lista = new LinkedList<Conta>();
		Conta contaCorrente1 = new ContaCorrente(10,11);
		Conta contaCorrente2 = new ContaCorrente(20,22);
		Conta contaCorrente3 = new ContaCorrente(30,33);
		Conta contaCorrente4 = new ContaCorrente(40,44);
		
		lista.add(contaCorrente1);
		lista.add(contaCorrente2);
		lista.add(contaCorrente3);
		lista.add(contaCorrente4);
		
		System.out.println("Quantidade de contas: "+lista.size());
		System.out.println("A conta guardada pesquisada é: "+lista.get(1));
		System.out.println("Removendo listas!"+lista.remove(0));
		System.out.println("Quantidade de contas: "+lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			Conta conta = lista.get(i);
			System.out.println(conta);
		}
		
		System.out.println();
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
















