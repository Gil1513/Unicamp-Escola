package br.edu.cotil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import java.net.*;
import java.net.http.*;
import java.sql.*;
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegracaoTest {
 @LocalServerPort int porta;
 HttpResponse<String> request(String verbo,String path,String json) throws Exception {
  return HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create("http://127.0.0.1:"+porta+path))
   .header("Content-Type","application/json").method(verbo,HttpRequest.BodyPublishers.ofString(json)).build(),HttpResponse.BodyHandlers.ofString());
 }
 @Test void cicloRestJpa() throws Exception {
  var novo=request("POST","/assuntos","{\"nome\":\"Java\"}");
  assertEquals(201,novo.statusCode()); String path=novo.headers().firstValue("Location").orElseThrow();
  assertTrue(request("GET",path,"").body().contains("Java"));
  assertEquals(200,request("PUT",path,"{\"nome\":\"JPA\"}").statusCode());
  assertTrue(request("PATCH",path+"/concluir","").body().contains("true"));
  assertEquals(400,request("POST","/assuntos","{\"nome\":\" \"}").statusCode());
  assertEquals(204,request("DELETE",path,"").statusCode());
  assertEquals(404,request("GET",path,"").statusCode());
 }
 @Test void jdbcReverteTransacao() throws Exception {
  try(Connection db=DriverManager.getConnection("jdbc:h2:mem:teste_jdbc")) {
   JdbcAtividade.exercitar(db);
   try(var s=db.createStatement();var rs=s.executeQuery("SELECT COUNT(*) FROM jdbc_estudo")) {
    assertTrue(rs.next()); assertEquals(0,rs.getInt(1));
   }
  }
 }
}
