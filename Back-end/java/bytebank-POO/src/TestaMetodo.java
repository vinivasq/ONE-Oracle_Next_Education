public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new ContaCorrente(6646,969060);
		contaDoPaulo.deposita(100);
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.getSaldo());

		contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.getSaldo());

		Conta contaDaMarcela = new ContaPoupanca(6644,969063);
		contaDaMarcela.deposita(1000);
		contaDaMarcela.transfere(300, contaDoPaulo);

		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoPaulo.getSaldo());
	}

}