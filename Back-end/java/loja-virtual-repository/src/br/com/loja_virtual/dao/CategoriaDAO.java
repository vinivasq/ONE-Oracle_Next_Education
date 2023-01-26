package br.com.loja_virtual.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.loja_virtual.modelo.Categoria;
import br.com.loja_virtual.modelo.Produto;

public class CategoriaDAO {
    private Connection connection;

    public CategoriaDAO(Connection connection){
        this.connection = connection;
    }

    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT ID, NOME FROM CATEGORIA";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();

            try(ResultSet rSet = pstm.getResultSet()){
                while(rSet.next()){
                    Categoria categoria = new Categoria(rSet.getInt(1), rSet.getString(2));

                    categorias.add(categoria);
                }
            }
        }
        return categorias;
    }

    public List<Categoria> listarComProdutos() throws SQLException {
        Categoria ultima = null;
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT C.ID, C.NOME, P.ID, P.NOME, P.DESCRICAO FROM CATEGORIA C INNER JOIN PRODUTO P ON C.ID = P.CATEGORIA_ID";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();

            try(ResultSet rSet = pstm.getResultSet()){
                while(rSet.next()){
                    if(ultima == null || !ultima.getNome().equals(rSet.getString(2))){
                        Categoria categoria = new Categoria(rSet.getInt(1), rSet.getString(2));

                        ultima = categoria;
                        categorias.add(categoria);
                    }

                    Produto produto = new Produto(rSet.getInt(3), rSet.getString(4), rSet.getString(5));
                    ultima.adicionaProduto(produto);
                }
            }
        }
        return categorias;
    }
}

