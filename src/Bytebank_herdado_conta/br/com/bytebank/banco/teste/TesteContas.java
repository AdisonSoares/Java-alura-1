package Bytebank_herdado_conta.br.com.bytebank.banco.teste;
import Bytebank_herdado_conta.br.com.bytebank.banco.modelo.*;


public class TesteContas {

	public static void main(String[] args)throws Bytebank_herdado_conta.br.com.bytebank.banco.modelo.SaldoInsuficienteException {
		ContaCorrente contaCorrente = new ContaCorrente(123, 123);
		ContaPoupanca contaPoupanca = new ContaPoupanca(456, 456);

		contaCorrente.deposita(100);
		contaPoupanca.deposita(200);

		contaCorrente.transfere(10.0, contaPoupanca);

		System.out.println("Saldo conta corrente: R$" + contaCorrente.getSaldo());
		System.out.println("Saldo conta poupanca: R$" + contaPoupanca.getSaldo());
	}
}
