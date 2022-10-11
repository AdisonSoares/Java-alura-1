package Bytebank_herdado_conta.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.Cliente;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        System.out.println();
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        //OrdenandoPorNumeroDaConta ordenandoPorNumeroDaConta = new OrdenandoPorNumeroDaConta();
        //lista.sort(new OrdenandoPorNumeroDaConta());
        //Collections.sort(lista, new OrdenandoPorNumeroDaConta());
        //Collections.sort(lista);
        lista.sort(null);
         
        System.out.println();
        
        for (Conta conta : lista) {
        	System.out.println(conta + ", " + conta.getTitular().getNome());
		}
        
        System.out.println();
        
        //OrdenandoPorTitular ordenandoPorTitular = new OrdenandoPorTitular();
        //lista.sort(new OrdenandoPorTitular());
        Collections.sort(lista, new OrdenandoPorTitular());
        
        for (Conta conta : lista) {
        	System.out.println(conta + ", " + conta.getTitular().getNome());
		}
	}
}

class OrdenandoPorTitular implements Comparator<Conta>{
	@Override
	public int compare(Conta conta_1, Conta conta_2) {
		String nome_1 = conta_1.getTitular().getNome();
		String nome_2 = conta_2.getTitular().getNome();
		return nome_1.compareTo(nome_2);
	}
}

class OrdenandoPorNumeroDaConta implements Comparator<Conta>{
	@Override
	public int compare(Conta conta_1, Conta conta_2) {
		return Integer.compare(conta_1.getNumero(), conta_2.getNumero());
		
		/*
		 return conta_1.getNumero() - conta_2.getNumero();
		 */
		
		
		/*
		if(conta_1.getNumero() < conta_2.getNumero()) {
			return -1;
		}
		if (conta_1.getNumero() > conta_2.getNumero()) {
			return 1;
		}
		return 0;
		*/
	}
}


















