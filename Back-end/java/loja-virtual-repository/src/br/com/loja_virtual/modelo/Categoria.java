package br.com.loja_virtual.modelo;

public class Categoria {

    private Integer id;
    private String nome;

    public Categoria(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("A categoria é: %d, %s", this.id, this.nome);
    }
}
