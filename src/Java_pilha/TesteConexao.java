package Java_pilha;

public class TesteConexao {

	public static void main(String[] args) {
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro de conexão!");
		}

//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro de conexão!");
//		}finally {
//			conexao.fecha();
//		}
	}
}
