// Gilmar da Silva — atividade de integração Java.
package br.edu.cotil;
import java.sql.*;
// JDBC: SQL explícito, parâmetros e rollback. Use somente uma base de laboratório.
public class JdbcAtividade {
 public static void exercitar(Connection db) throws SQLException {
  try(Statement s=db.createStatement()) {
   s.executeUpdate("CREATE TABLE IF NOT EXISTS jdbc_estudo (id INTEGER PRIMARY KEY, nome VARCHAR(80) NOT NULL)");
  }
  boolean auto=db.getAutoCommit(); db.setAutoCommit(false);
  try {
   try(PreparedStatement s=db.prepareStatement("INSERT INTO jdbc_estudo VALUES (?, ?)")) {
    s.setInt(1,201269); s.setString(2,"Gilmar da Silva"); s.executeUpdate();
   }
   try(PreparedStatement s=db.prepareStatement("UPDATE jdbc_estudo SET nome=? WHERE id=?")) {
    s.setString(1,"Estudo de JDBC"); s.setInt(2,201269);
    if(s.executeUpdate()!=1) throw new SQLException("Registro ausente");
   }
   try(PreparedStatement s=db.prepareStatement("SELECT nome FROM jdbc_estudo WHERE id=?")) {
    s.setInt(1,201269);
    try(ResultSet rs=s.executeQuery()) {
     if(!rs.next() || !"Estudo de JDBC".equals(rs.getString(1))) throw new SQLException("Consulta incorreta");
    }
   }
   // Reverte os dados deste exercício; a tabela de laboratório continua existindo.
  } finally { db.rollback(); db.setAutoCommit(auto); }
 }
 public static void main(String[] args) throws Exception {
  String url=System.getenv().getOrDefault("JDBC_URL","jdbc:h2:mem:jdbc_aula");
  String user=System.getenv().getOrDefault("DB_USER","sa");
  String senha=System.getenv().getOrDefault("DB_PASSWORD","");
  try(Connection db=DriverManager.getConnection(url,user,senha)) { exercitar(db); }
  System.out.println("INSERT, UPDATE, SELECT e rollback concluídos.");
 }
}
