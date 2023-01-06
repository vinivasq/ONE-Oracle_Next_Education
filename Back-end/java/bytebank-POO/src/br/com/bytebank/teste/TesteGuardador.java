package br.com.bytebank.teste;

import br.com.bytebank.modelo.conta.Conta;
import br.com.bytebank.modelo.conta.ContaCorrente;
import br.com.bytenk.modelo.GuardadorDeContas;

public class TesteGuardador {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 25);
        Conta cc2 = new ContaCorrente(22, 29);

        GuardadorDeContas guardador = new GuardadorDeContas();

        guardador.adiciona(cc1);
        guardador.adiciona(cc2);

        System.out.println(guardador.getQuantidadeDeContas());
        System.out.println(guardador.getReferencia(0).getNumero());
    }   

}
