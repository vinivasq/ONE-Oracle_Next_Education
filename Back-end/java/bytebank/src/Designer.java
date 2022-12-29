//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario {
	
	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}	

}