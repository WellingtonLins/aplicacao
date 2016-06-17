
package br.com.dac.aplicacaoweb;

/**
 *
 * @author Wellington
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutosJDBC implements Produtos {

    private Connection connection;
    private String url = "jdbc:postgresql://localhost/dac-jsf";
    private String usuario = "postgres";
    private String senha = "123";

    public ProdutosJDBC() {
        initConnection();
    }

    private void initConnection() {

        try {
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void salvar(Produto produto) {
        String sql = "INSERT INTO produtos(descricao) values(?)";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, produto.getDescricao());
            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProdutosJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
