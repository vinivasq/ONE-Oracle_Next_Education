package br.com.bytebank.teste;

import br.com.bytebank.modelo.conta.Cliente;
import br.com.bytebank.modelo.conta.Conta;
import br.com.bytebank.modelo.conta.ContaPoupanca;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente("Paulo Silveira", "222.222.222.-22", "programador");

		Conta contaDoPaulo = new ContaPoupanca(6646,969060);
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());

	}
}