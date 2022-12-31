public class TesteTributaveis {
    
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2312, 231445332);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculaImposto impostos = new CalculaImposto();
        impostos.registra(cc);
        impostos.registra(seguro);

        System.out.println(impostos.getTotalImposto());
    }

    
}
