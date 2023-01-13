import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RefatorandoInsercoes {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        try(Connection con = connectionFactory.recuperarConexao()){
            con.setAutoCommit(false);

            try(PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) {

                adicionarItem("Smart TV", "Televisão Samsung", stm);
                adicionarItem("Iphone", "Iphone 12 mini", stm);

                con.commit();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
                con.rollback();
            }
        }
    }

    private static void adicionarItem(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        if(nome.equals("Iphone")){
            throw new RuntimeException("Não foi possível adicionar o produto.");
        }

        stm.execute();

        try(ResultSet result = stm.getGeneratedKeys()){ 
            while(result.next()){
                Integer id = result.getInt(1);
                System.out.println("O produto inserido foi: " + id);
            }
        }
    }
}
