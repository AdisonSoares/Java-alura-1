package Bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double saque = valor + 0.2;
		super.saca(saque);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	
	@Override
	public String toString() {
		return "Conta corrente, " + super.toString();
	}
}

















