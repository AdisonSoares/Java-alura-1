package Bytebank_herdado;

public class SistemaInterno {
	private int senha = 147;
	
	public void autentica(Autorizado autorizado) {
		boolean autenticado = autorizado.autentica(this.senha);
		if (autenticado) {
			System.out.println("Autorizado!");
		}else {
			System.out.println("Não autorizado!");
		}
	}
}
