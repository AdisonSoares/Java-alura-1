package Bytebank_encapsulado;

public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 963852 );
		System.out.println("Número da conta: "+conta.getNumero());
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		Cliente titularConta = conta.getTitular();
		//Cliente titularConta = paulo; - Obs: É a mesma situação acima
		titularConta.setProfissao("Programador");
		
		System.out.println(titularConta.getProfissao());
		System.out.println(paulo.getProfissao());
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
