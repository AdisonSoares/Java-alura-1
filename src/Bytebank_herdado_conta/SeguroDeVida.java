package Bytebank_herdado_conta;

public class SeguroDeVida implements Tributavel {

	private double valorDoSeguro = 42;
	
	@Override
	public double getValorImposto() {
		return this.valorDoSeguro;
	}

}
