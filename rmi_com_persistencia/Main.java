package br.com.diego.banco;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		ContaDAOImplementacao contaDAO = new ContaDAOImplementacao();

		Conta contaJoao = new Conta();
		contaJoao.setId(6);
		contaJoao.setNome("José");
		contaJoao.setSaldo(new BigDecimal(100));

		contaDAO.inserir(contaJoao);

		Conta contaJoaoConsulta = contaDAO.consultar("José");
		System.out.println(contaJoaoConsulta.toString());

	}
}
