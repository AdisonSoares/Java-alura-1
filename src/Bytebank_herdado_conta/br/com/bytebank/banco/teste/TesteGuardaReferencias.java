package Bytebank_herdado_conta.br.com.bytebank.banco.teste;

import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.GuardaContas;

public class TesteGuardaReferencias {

	public static void main(String[] args) {
		GuardaContas guardaContas = new GuardaContas();
		Conta contaCorrente = new ContaCorrente(22,11);
		Conta contaCorrente2 = new ContaCorrente(22,33);
		Conta contaPoupanca = new ContaPoupanca(44,55);
		Conta referencia;
		int tamanho;
		
		guardaContas.adiciona(contaCorrente);
		guardaContas.adiciona(contaCorrente2);
		guardaContas.adiciona(contaPoupanca);
		
		tamanho = guardaContas.getTotalContas();
		
		referencia = guardaContas.getReferencias(2);
		System.out.println("A conta guardada pesquisada é: "+referencia);
		System.out.println("Quantidade de contas: "+tamanho);
	}
}
	