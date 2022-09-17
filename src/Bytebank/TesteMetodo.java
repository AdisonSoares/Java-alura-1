package Bytebank;

public class TesteMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		boolean retirada = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println("Retirada: "+retirada);
		
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.deposita(1000);
		if(contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferência realizada!");
		}else {
			System.out.println("Transferência não realizada!");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println("Titular: "+contaDoPaulo.titular);
		
	}
}
