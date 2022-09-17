package Bytebank_encapsulado;

public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println("Número da conta: "+conta.getNumero());
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		Cliente titularConta = conta.getTitular();
		titularConta.setProfissao("Programador");
		
		System.out.println(titularConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
	}
}
