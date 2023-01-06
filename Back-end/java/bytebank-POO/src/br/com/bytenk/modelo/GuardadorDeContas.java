package br.com.bytenk.modelo;

import br.com.bytebank.modelo.conta.Conta;

public class GuardadorDeContas {
    private Conta[] referencias;
    private int posicaoLivre = 0;
    
    
    public GuardadorDeContas() {
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeContas(){
        return this.posicaoLivre;
    }

    public Conta getReferencia(int ref){
        return this.referencias[ref];
    }
}
