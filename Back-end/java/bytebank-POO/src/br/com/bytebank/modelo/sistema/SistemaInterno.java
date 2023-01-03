package br.com.bytebank.modelo.sistema;

import br.com.bytebank.modelo.interfaces.Autenticavel;

public class SistemaInterno {
    private int senhaSistema = 2222;

    public void autentica(Autenticavel usuario) {
        boolean autenticou = usuario.autentica(senhaSistema);

        if(autenticou) {
            System.out.println("Você pode acessar o sistema");
        } else {
            System.out.println("Não pode acessar o sistema");
        }
    }
}
