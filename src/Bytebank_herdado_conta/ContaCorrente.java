package Bytebank_herdado_conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double saque = valor + 0.2;
		return super.saca(saque);
	}
}
