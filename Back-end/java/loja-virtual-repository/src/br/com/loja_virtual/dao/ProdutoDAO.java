package br.com.loja_virtual.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.loja_virtual.modelo.Categoria;
import br.com.loja_virtual.modelo.Produto;

public class ProdutoDAO {
    private Connection connection;

    public ProdutoDAO(Connection connection){
        this.connection = connection;
    }

    public void salvar(Produto produto) throws SQLException {
        String sql = "INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?);";
        
        try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
    
            pstm.execute();
    
            try(ResultSet rst = pstm.getGeneratedKeys()){
                while(rst.next()){
                    produto.setId(rst.getInt(1));
                }
            }
        }
    }

    public List<Produto> listar() throws SQLException{
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM PRODUTO";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();

            try(ResultSet rSet = pstm.getResultSet()){
                while(rSet.next()){
                    Produto produto = new Produto(rSet.getInt(1), rSet.getString(2), rSet.getString(3));
                    
                    produtos.add(produto);
                }
            }
        }
        return produtos;
    }

    public List<Produto> buscarPorCategoria(Categoria categoria) throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM PRODUTO WHERE categoria_id = ?";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.setInt(1, categoria.getId());
            pstm.execute();

            try(ResultSet rSet = pstm.getResultSet()){
                while(rSet.next()){
                    Produto produto = new Produto(rSet.getInt(1), rSet.getString(2), rSet.getString(3));
                    
                    produtos.add(produto);
                }
            }
        }
        return produtos;
    }
}
