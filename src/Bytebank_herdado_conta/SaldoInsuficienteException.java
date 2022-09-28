package Bytebank_herdado_conta;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
