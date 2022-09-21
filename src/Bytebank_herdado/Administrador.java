package Bytebank_herdado;

public class Administrador extends Funcionario implements Autorizado{
	private AutenticacaoCompose autenticacaoCompose;
	
	public Administrador() {
		autenticacaoCompose = new AutenticacaoCompose();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticacaoCompose.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacaoCompose.autentica(senha);
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação do administrador!");
		return 50;
	}
}










