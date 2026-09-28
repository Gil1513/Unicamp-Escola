/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Conexao.java
Explicação: classes agrupam dados e comportamentos; persistência conecta objetos ao banco de dados; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package connection;

// import com.mysql.jdbc.Connection;
import java.sql.Connection;
import static java.lang.System.exit;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection() {
        String url = "jdbc:mysql://143.106.241.3:3306/201269";
        String user = "201269";
        String password = "cl*13072005";

        try {
            return (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro na conexao... \n" + e.toString());
            exit(1);
            return null;
        }
    }
}
