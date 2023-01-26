package br.com.loja_virtual.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private Integer id;
    private String nome;
    private List<Produto> produtos = new ArrayList<Produto>();

    public Categoria(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("A categoria é: %d. %s", this.id, this.nome);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }
}
