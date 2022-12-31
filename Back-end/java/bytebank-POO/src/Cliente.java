public class Cliente implements Autenticavel {

    private String nome;
    private String cpf;
    private String profissao;
    private Autenticador autenticador;

    public Cliente (String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.autenticador = new Autenticador();

    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getProfissao() {
        return profissao;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);;
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}