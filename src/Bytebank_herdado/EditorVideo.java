package Bytebank_herdado;

public class EditorVideo extends Funcionario implements Autorizado {
	private AutenticacaoCompose autenticacaoCompose;
	
	public EditorVideo() {
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
		System.out.println("Bonificação do editor de vídeo!");
		return 150;
	}
}
