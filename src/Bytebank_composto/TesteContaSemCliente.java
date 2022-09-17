package Bytebank_composto;

public class TesteContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.titular = new Cliente();
		
		System.out.println(contaDaMarcela.getSaldo());
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		
	}
}
