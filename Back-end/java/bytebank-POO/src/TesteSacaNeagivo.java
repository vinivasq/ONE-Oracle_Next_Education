public class TesteSacaNeagivo {
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca(6646,969060);
		conta.deposita(100);
		try {
			conta.saca(101);
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println("Operação não realizada pelo erro: " + message);
		}

		System.out.println(conta.getSaldo());

	}
}