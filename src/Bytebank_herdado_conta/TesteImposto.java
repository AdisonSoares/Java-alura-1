package Bytebank_herdado_conta;

public class TesteImposto {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(963, 852);
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		CalcularImposto calcularImposto = new CalcularImposto();
		
		contaCorrente.deposita(1000);
		
		calcularImposto.calcula(contaCorrente);
		calcularImposto.calcula(seguroDeVida);
		
		System.out.println("Valor total de impostos: R$"+calcularImposto.getTotalImposto());
	}
}
