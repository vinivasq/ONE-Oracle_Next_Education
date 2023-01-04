package br.com.alura.bytebank;

import br.com.bytebank.modelo.conta.ContaCorrente;

public class TesteBiblioteca {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(225, 11111);
        System.out.println(cc.getAgencia());
    }
}
