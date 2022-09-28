package Bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class SeguroDeVida implements Tributavel {

	private double valorDoSeguro = 42;
	
	@Override
	public double getValorImposto() {
		return this.valorDoSeguro;
	}

}
