package br.com.loja_virtual.teste;


import java.sql.SQLException;

import br.com.loja_virtual.factory.ConnectionFactory;

public class TestaPoolConexoes {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        for (int i = 0; i < 20; i++) {
            connectionFactory.recuperarConexao();
            System.out.println("Conexão de numero: " + i);
        }
    }
}
