public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario vinicius = new Funcionario("Vinicius Vasques", "05097571037", 2100.00);
        
        System.out.println(vinicius.getNome());
        System.out.println(vinicius.getCpf());
        System.out.println(vinicius.getSalario());

        Gerente matheus = new Gerente("Matheus", "3418521911", 8400.50, "chefe");

        System.out.println(matheus.getSenha());
        System.out.println(matheus.autenticaSenha("chefe"));
        System.out.println(matheus.getNome());
        System.out.println(matheus.getBonificacao());

        System.out.println(Funcionario.totalFuncionarios);
    }
}
