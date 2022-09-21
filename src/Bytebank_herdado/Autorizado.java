package Bytebank_herdado;

public abstract interface Autorizado{
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
