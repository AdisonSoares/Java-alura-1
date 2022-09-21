package Bytebank_herdado;

public class Cliente implements Autorizado {
	private AutenticacaoCompose autenticacaoCompose;

	public Cliente() {
		this.autenticacaoCompose = new AutenticacaoCompose();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacaoCompose.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacaoCompose.autentica(senha);
	}
}
