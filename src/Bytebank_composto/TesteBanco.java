package Bytebank_composto;

public class TesteBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "000.457.812-80";
		paulo.profissao = "Analista de sistemas";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(paulo.nome);
		
	}
}
