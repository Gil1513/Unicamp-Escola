// Gilmar da Silva — atividade de integração Java.
package br.edu.cotil;
import jakarta.persistence.*;
// JPA mapeia o objeto para a tabela; Hibernate implementa esse contrato.
@Entity
public class Assunto {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String nome;
 private boolean concluido;
 protected Assunto() {} // Necessário ao provedor JPA.
 public Assunto(String nome) { alterarNome(nome); }
 public Long getId() { return id; }
 public String getNome() { return nome; }
 public boolean isConcluido() { return concluido; }
 public void alterarNome(String nome) {
  if(nome==null || nome.isBlank() || nome.trim().length()>80) throw new IllegalArgumentException("Nome deve ter de 1 a 80 caracteres");
  this.nome=nome.trim();
 }
 public void concluir() { concluido=true; }
}
