package br.com.bytebank.modelo.sistema;

import br.com.bytebank.modelo.interfaces.Tributavel;

public class SeguroDeVida  implements Tributavel{
    @Override
    public double getValorImposto() {
        return 42;
    }
}
