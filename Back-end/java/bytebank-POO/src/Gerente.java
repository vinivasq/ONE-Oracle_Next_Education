public class Gerente extends Funcionario implements Autenticavel{
    private Autenticador autenticador;
    
    
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.autenticador = new Autenticador();
    }

    public double getBonificacao() {
        return super.getSalario() * 0.5;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
