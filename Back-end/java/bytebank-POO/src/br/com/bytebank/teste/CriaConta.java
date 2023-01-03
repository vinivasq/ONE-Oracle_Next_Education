package br.com.bytebank.teste;

import br.com.bytebank.modelo.conta.Conta;
import br.com.bytebank.modelo.conta.ContaCorrente;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new ContaCorrente(6646,969060);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new ContaCorrente(6645,969061);
        segundaConta.deposita(50);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        System.out.println("referenciar: " + primeiraConta);
    }

}