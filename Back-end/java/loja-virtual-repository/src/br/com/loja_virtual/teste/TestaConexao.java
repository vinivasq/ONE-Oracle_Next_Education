package br.com.loja_virtual.teste;

import java.sql.Connection;
// import java.sql.DriverManager;
import java.sql.SQLException;
import br.com.loja_virtual.factory.ConnectionFactory;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {

        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "admin");

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();
        
        System.out.println("Fechando conexão");
        con.close();
    }
}
