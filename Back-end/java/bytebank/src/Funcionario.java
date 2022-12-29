public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    static int totalFuncionarios = 0;

    public Funcionario(String nome, String cpf, double salario) {
        totalFuncionarios ++;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract double getBonificacao();

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
