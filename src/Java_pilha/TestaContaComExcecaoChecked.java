package Java_pilha;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta conta = new Conta();
		try {
			conta.deposita();
		} catch (Exception e) {
			System.out.println("Tratamento de excessão!");
		}
		

	}

}
