public class TesteReferencias {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Marcos", "541304987725", 5000.0, "1608");

        EditorVideo ev = new EditorVideo("Lucas", "65849215730", 2500.0);

        Designer d = new Designer("Cassius", "98203215739", 2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }
}