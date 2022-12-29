public class TestaContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(8558, 12391239);
        ContaPoupanca contaPoupanca = new ContaPoupanca(8558, 65484218);
        
        contaCorrente.deposita(1500);
        contaPoupanca.deposita(5000);
        contaCorrente.transfere(500, contaPoupanca);

        System.out.println(contaCorrente.getSaldo());   
        System.out.println(contaPoupanca.getSaldo());
    
    }
}
