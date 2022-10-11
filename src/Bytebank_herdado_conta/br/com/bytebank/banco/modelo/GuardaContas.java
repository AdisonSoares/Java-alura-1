package Bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class GuardaContas {
	private Object[] referencias;
	private int ind;

	public GuardaContas() {
		this.referencias = new Conta[10];
		this.ind = 0;
	}
	
	public void adiciona(Conta conta) {
		this.referencias[this.ind] = conta;
		this.ind++;
	}
	
	public int getTotalContas() {
		return this.ind;
	}

	public Conta getReferencias(int posicao) {
		return (Conta)referencias[posicao];	}
}
