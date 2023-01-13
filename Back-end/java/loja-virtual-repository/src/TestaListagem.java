import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();
        
        Statement stm = con.createStatement();
        stm.execute("SELECT * FROM PRODUTO");

        ResultSet result = stm.getResultSet();

        while(result.next()){
            Integer id = result.getInt("id");
            String nome = result.getString("nome");
            String descricao = result.getString("descricao");
            System.out.println(id);
            System.out.println(nome);
            System.out.println(descricao);
        }

        con.close();
    }
}
