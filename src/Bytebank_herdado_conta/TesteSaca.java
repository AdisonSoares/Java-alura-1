package Bytebank_herdado_conta;

public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(123, 321);
		contaCorrente.deposita(200);
		try {
			contaCorrente.saca(220);
		} catch (Exception ex) {
			System.out.println("Erro! "+ex.getMessage());
		}
		
		
		System.out.println("Saldo da conta: R$"+contaCorrente.getSaldo());
	}

}
