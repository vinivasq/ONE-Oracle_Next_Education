package br.com.loja_virtual.teste;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.loja_virtual.factory.ConnectionFactory;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");

        stm.setInt(1, 2);
        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();

        System.out.println("Linhas removidas: " + linhasModificadas);

        con.close();
    }
}
