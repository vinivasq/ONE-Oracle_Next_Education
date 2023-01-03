package br.com.bytebank.modelo.sistema;

import br.com.bytebank.modelo.funcionario.Funcionario;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }

}