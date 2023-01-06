package br.com.bytebank.teste;

import java.util.ArrayList;

import br.com.bytebank.modelo.conta.Conta;
import br.com.bytebank.modelo.conta.ContaCorrente;

public class TestandoEquals {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 22);
        Conta cc2 = new ContaCorrente(22, 22);

        ArrayList<Conta> lista = new ArrayList<Conta>();
        lista.add(cc2);

        boolean existe = lista.contains(cc1);

        System.out.println("Já existe uma conta com os mesmos dados? " + existe);

    }
}
