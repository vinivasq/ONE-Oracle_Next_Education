package br.com.loja_virtual.teste;


import java.sql.Connection;
import java.sql.SQLException;

import br.com.loja_virtual.dao.ProdutoDAO;
import br.com.loja_virtual.factory.ConnectionFactory;
import br.com.loja_virtual.modelo.Produto;

public class TestaInsercaoComProduto {
    public static void main(String[] args) throws SQLException {
        Produto macbook = new Produto("Macbook Pro", "Mackbook Pro 2022 M1 Pro");

        try(Connection con = new ConnectionFactory().recuperarConexao()){
            ProdutoDAO produtoDAO = new ProdutoDAO(con);
            produtoDAO.salvar(macbook);

            // produtoDAO.listar();
        }
    }
}
