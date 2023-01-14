package br.com.loja_virtual.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.loja_virtual.modelo.Categoria;

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
}

