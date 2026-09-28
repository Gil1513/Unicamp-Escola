# 09–11 — JDBC, JPA/Hibernate, REST e Maven

Gilmar da Silva — 201269

Requer JDK 17+ (Spring Boot 4.1.1 suporta até Java 26) e Maven 3.6.3+. Abra este `pom.xml` como projeto Maven na IDE. Cada laboratório pode ser estudado separadamente.

## 09 — JDBC: SQL e transações

Leia `JdbcAtividade.java`. Identifique Connection, PreparedStatement, ResultSet e fechamento automático com try-with-resources. Execute:

```powershell
mvn test
mvn dependency:copy-dependencies
java -cp "target/classes;target/dependency/*" br.edu.cotil.JdbcAtividade
```

No Linux/macOS troque `;` por `:` no classpath. O exemplo padrão usa H2 em memória. Para MySQL ou PostgreSQL, crie antes uma base **cotil_estudos** vazia e um usuário local autorizado, depois configure uma das URLs:

```powershell
$env:JDBC_URL='jdbc:postgresql://localhost:5432/cotil_estudos'
# Alternativa: jdbc:mysql://localhost:3306/cotil_estudos
$env:DB_USER='seu_usuario_local'
$env:DB_PASSWORD='sua_senha_local'
java -cp "target/classes;target/dependency/*" br.edu.cotil.JdbcAtividade
```

Entrega: mostre a consulta durante a transação e a contagem zero depois do rollback. Desafio: adicione DELETE, provoque uma chave duplicada e confirme que a transação inteira foi revertida. A criação da tabela é separada do rollback dos dados.

## 10 — JPA/Hibernate e API REST

Compare o SQL explícito com `Assunto`, `AssuntoRepository` e `AssuntoController`. Anote entidade, chave, construtor JPA e injeção de dependência. Execute `mvn spring-boot:run`, depois, em outro terminal:

```powershell
$a=Invoke-RestMethod http://localhost:8080/assuntos -Method Post -ContentType application/json -Body '{"nome":"Java"}'
Invoke-RestMethod "http://localhost:8080/assuntos/$($a.id)"
Invoke-RestMethod "http://localhost:8080/assuntos/$($a.id)" -Method Put -ContentType application/json -Body '{"nome":"JPA"}'
Invoke-RestMethod "http://localhost:8080/assuntos/$($a.id)/concluir" -Method Patch
Invoke-RestMethod "http://localhost:8080/assuntos/$($a.id)" -Method Delete
```

Entrega: demonstre 201, 200, 204, 400 (nome vazio) e 404 (id ausente). O H2 é descartado ao encerrar o app. Para banco externo use `DB_URL` com uma das URLs JDBC acima, além de usuário e senha. Desafio: crie paginação e uma camada de serviço; substitua `ddl-auto=update` por migrações ao evoluir além do laboratório.

## 11 — Maven, dependências e testes

Execute `mvn test`, `mvn dependency:tree` e `mvn package`. Identifique no POM coordenadas, versão, escopos runtime/test, parent e plugin. Inicie o JAR com `java -jar target/trilha-java-1.0.0.jar`.

Entrega: explique por que o driver H2 é runtime, JUnit é test e o controller não deve depender de JUnit. Desafio: adicione um teste HTTP de JSON inválido e um teste para nome acima de 80 caracteres.

Referências: [REST Spring](https://spring.io/guides/gs/rest-service/), [JPA](https://spring.io/guides/gs/accessing-data-jpa/), [Maven](https://maven.apache.org/guides/getting-started/). O teste automatizado usa H2; bancos externos exigem execução própria.
