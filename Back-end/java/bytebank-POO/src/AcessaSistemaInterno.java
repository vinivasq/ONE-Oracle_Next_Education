public class AcessaSistemaInterno {
    public static void main(String[] args) {
        Gerente vinicius = new Gerente("Vinicius Vasques", "65449832152", 9000.0);
        vinicius.setSenha(2222);
        Cliente marcos = new Cliente("Marcos Ribeiro", "65484235102", "Professor");
        marcos.setSenha(2325);

        SistemaInterno sistema = new SistemaInterno();

        sistema.autentica(marcos);
        sistema.autentica(vinicius);
    }
}
