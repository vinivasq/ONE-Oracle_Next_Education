package br.com.bytebank.modelo.conta;

public class ContaPoupanca extends Conta{
    public ContaPoupanca (int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public String toString() {
        return "Conta Poupança. " + super.toString();
    }
}
