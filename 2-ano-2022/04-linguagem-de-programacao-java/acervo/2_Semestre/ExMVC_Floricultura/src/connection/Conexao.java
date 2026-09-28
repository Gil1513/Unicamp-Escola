/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Conexao.java
Explicação: classes agrupam dados e comportamentos; persistência conecta objetos ao banco de dados; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.jdbc.Connection;
import static java.lang.System.exit;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gilmar da Silva
 */
public class Conexao {

    public Connection getConnection() {
        String url = "jdbc:mysql://143.106.241.3:3306/201269";
        String usuario = "201269";
        String senha = "cl*13072005";
        
        try {
            return (Connection) DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.toString());
            exit(1);
            return null;
        }
    }
}
