package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
//		Cliente cliente = new Cliente();
//		cliente.setNome("Nicolas");
//		cliente.setProfissao("Desenvolvedor");
//		cliente.setCpf("00785297301");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente)ois.readObject();
		ois.close();
		System.out.println(cliente.getCpf());
	}

}
