public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new ContaPoupanca(6646,969060);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente("Marcela", "951248324525", "streamer"));
		System.out.println(contaDaMarcela.getTitular());

		System.out.println(contaDaMarcela.getTitular().getNome());

	}
}