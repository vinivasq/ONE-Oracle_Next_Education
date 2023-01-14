package br.com.loja_virtual.teste;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.loja_virtual.factory.ConnectionFactory;

public class TestaPreparedStatement {
    public static void main(String[] args) throws SQLException {
        String nome = "Mouse'";
        String descricao = "Mouse sem fio); delete from produto;";

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);

        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();

        ResultSet result = stm.getGeneratedKeys();

        while(result.next()){
            Integer id = result.getInt(1);
            System.out.println("O produto inserido foi: " + id);
        }

        con.close();
    }
}
