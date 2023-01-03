package br.com.bytebank.teste;

import br.com.bytebank.modelo.funcionario.Funcionario;
import br.com.bytebank.modelo.funcionario.Gerente;

public class TestaFuncionario {
    public static void main(String[] args) {
        // Funcionario vinicius = new Funcionario("Vinicius Vasques", "05097571037", 2100.00);
        
        // System.out.println(vinicius.getNome());
        // System.out.println(vinicius.getCpf());
        // System.out.println(vinicius.getSalario());
        // Não pode ser compilado pois agora "funcionario" é uma classe abstrata

        Gerente matheus = new Gerente("Matheus", "3418521911", 8400.50);

        System.out.println(matheus.autentica(2222));
        System.out.println(matheus.getNome());
        System.out.println(matheus.getBonificacao());

        System.out.println(Funcionario.getTotalFuncionarios());
    }
}
