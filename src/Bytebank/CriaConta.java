package Bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("Saldo primeira conta:"+primeiraConta.saldo);
		System.out.println("Saldo segunda conta:"+segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println("Agencia da primeira conta: "+primeiraConta.agencia);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("Agencia da segunda conta: "+segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}else {
			System.out.println("Contas diferentes!");
		}

	}

}
