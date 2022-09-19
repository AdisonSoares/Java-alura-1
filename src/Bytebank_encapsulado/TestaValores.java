package Bytebank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1489, 456789);
		System.out.println("Agência: "+conta.getAgencia());
		conta.deposita(200);
		
		Conta conta2 = new Conta(1450, 456798);
		System.out.println("Agência: "+conta2.getAgencia());
		System.out.println("Valor depositado: "+conta.getSaldo());
		
		System.out.println("Contas que pertecem a classe: "+conta.getTotal());
		System.out.println("Contas que pertecem a classe: "+Conta.getTotal());
		
	}
}
