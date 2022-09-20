package Bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente_2 = new Gerente();
		gerente_2.setNome("Fernando Silva");
		gerente_2.setCpf("105.578.751-00");
		gerente_2.setSalario(2600.0);
		
		System.out.println("Nome do funcionário: "+gerente_2.getNome());
		System.out.println("Valor da bonificação: R$"+gerente_2.getBonificacao());
		
		//funcionario_1.salario = 300;
	}
}
