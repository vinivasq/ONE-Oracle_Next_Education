package br.com.bytebank.modelo.sistema;

import br.com.bytebank.modelo.interfaces.Tributavel;

public class CalculaImposto {
    private double totalImposto;

    public void registra (Tributavel conta) {
        double valor = conta.getValorImposto();
        totalImposto += valor;

    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
