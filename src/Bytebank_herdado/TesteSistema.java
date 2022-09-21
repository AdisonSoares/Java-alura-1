package Bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerenteNovo = new Gerente();
		Administrador administrador = new Administrador();
		Designer designer = new Designer();
		EditorVideo editorVideo = new EditorVideo();
		Cliente cliente = new Cliente();
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		gerenteNovo.setSenha(147);
		sistemaInterno.autentica(gerenteNovo);
		administrador.setSenha(258);
		sistemaInterno.autentica(administrador);
		designer.setSenha(147);
		sistemaInterno.autentica(designer);
		editorVideo.setSenha(741);
		sistemaInterno.autentica(editorVideo);
		cliente.setSenha(852);
		sistemaInterno.autentica(cliente);
		
	}
}
