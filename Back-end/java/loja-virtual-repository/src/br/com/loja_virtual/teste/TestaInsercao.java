package br.com.loja_virtual.teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.loja_virtual.factory.ConnectionFactory;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')", Statement.RETURN_GENERATED_KEYS);

        ResultSet result = stm.getGeneratedKeys();

        while(result.next()){
            Integer id = result.getInt(1);
            System.out.println("O produto inserido foi: " + id);
        }

        con.close();
    }
}
