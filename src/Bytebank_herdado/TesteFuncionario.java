package Bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario_1 = new Funcionario();
		funcionario_1.setNome("Fernando Silva");
		funcionario_1.setCpf("105.578.751-00");
		funcionario_1.setSalario(2600.0);
		
		System.out.println("Nome do funcionário: "+funcionario_1.getNome());
		System.out.println("Valor da bonificação: R$"+funcionario_1.getBonificacao());

	}

}
