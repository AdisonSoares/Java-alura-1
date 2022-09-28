package Bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class CalcularImposto {
	private double total;
	
	public void calcula(Tributavel tributavel) {
		double imposto = tributavel.getValorImposto();
		this.total += imposto;
	}
	
	public double getTotalImposto() {
		return this.total;
	}
}
