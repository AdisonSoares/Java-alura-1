package Bytebank_herdado_conta.br.com.bytebank.banco.teste;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		Conta[] conta = new Conta[5];
		ContaCorrente contaCorrente = new ContaCorrente(22, 11);
		ContaPoupanca contaPoupanca = new ContaPoupanca(33, 22);
		
		conta[0] = contaCorrente;
		conta[1] = contaPoupanca;
		
		System.out.println(conta[0].getNumero());
		System.out.println(conta[1].getNumero());
		
		Conta ref1 = conta[0];
		Conta ref2 = conta[1];
		
		System.out.println(ref1.getNumero());
		System.out.println(ref2.getNumero());
		
		ContaCorrente ref3= (ContaCorrente)conta[0];
		ContaPoupanca ref4 = (ContaPoupanca)conta[1];
		
		System.out.println(ref3.getNumero());
		System.out.println(ref4.getNumero());
	}
}
