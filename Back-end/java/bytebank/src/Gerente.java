public class Gerente extends Funcionario {
    private String senha;
    
    
    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean autenticaSenha(String senha) {
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
    
    public String getSenha() {
        return senha;
    }

    public double getBonificacao() {
        return super.getSalario() * 0.5;
    }
}
