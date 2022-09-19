package Bytebank_herdado;

public class TesteGerente {
	public static void main(String[] args) {
		Gerente gerente_1 = new Gerente();
		gerente_1.setNome("Marcio Pontes"); 
		gerente_1.setCpf("097.985.163-71");
		gerente_1.setSalario(5000.0);
		
		System.out.println(gerente_1.getNome());
		System.out.println(gerente_1.getCpf());
		System.out.println(gerente_1.getSalario());
		
		gerente_1.setSenha(1234);
		boolean autenticou = gerente_1.autentica(1234);
		
		System.out.println("Gerente autenticado? "+ autenticou);
	}
}
