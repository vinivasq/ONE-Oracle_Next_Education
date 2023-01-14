package br.com.loja_virtual.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.loja_virtual.dao.CategoriaDAO;
import br.com.loja_virtual.factory.ConnectionFactory;
import br.com.loja_virtual.modelo.Categoria;

public class TestaListagemDeCategorias {
    public static void main(String[] args) throws SQLException{

        try(Connection connection = new ConnectionFactory().recuperarConexao()){
            CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
            List<Categoria> listaDeCategorias = categoriaDAO.listar();

            listaDeCategorias.stream().forEach(categoria -> System.out.println(categoria));
        }
    }
}
