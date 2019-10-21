package br.com.diego.banco;

public interface ContaDAO {
	public Conta consultar(String nome);
	public boolean inserir (Conta conta);
}
