public class TestaConexao {
    public static void main(String[] args) {

        try(Conexao con = new Conexao()) {
            con.leDados();
        } catch(Exception e) {
            System.out.println("Erro na conexão.");
        }


        // Conexao con = null;
        // try {
        //     con =  new Conexao();
        //     con.leDados();
        // } catch (Exception e) {
        //     System.out.println("Erro na conexão.");
        // } finally {
        //     con.close();
        // }
    }
}
