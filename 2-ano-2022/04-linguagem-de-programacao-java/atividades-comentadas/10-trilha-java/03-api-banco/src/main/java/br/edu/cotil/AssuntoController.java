// Gilmar da Silva — atividade de integração Java.
package br.edu.cotil;
import java.net.URI;
import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
// Controller cuida do contrato HTTP; o repositório cuida da persistência.
@RestController @RequestMapping("/assuntos")
public class AssuntoController {
 private final AssuntoRepository repo;
 public AssuntoController(AssuntoRepository repo) { this.repo=repo; }
 public record Entrada(String nome) {}
 private Assunto buscar(long id) { return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)); }
 @GetMapping public List<Assunto> listar() { return repo.findAll(); }
 @GetMapping("/{id}") public Assunto obter(@PathVariable long id) { return buscar(id); }
 @PostMapping public ResponseEntity<Assunto> criar(@RequestBody Entrada entrada) {
  Assunto salvo=repo.save(new Assunto(entrada.nome()));
  return ResponseEntity.created(URI.create("/assuntos/"+salvo.getId())).body(salvo);
 }
 @PutMapping("/{id}") public Assunto editar(@PathVariable long id,@RequestBody Entrada entrada) {
  Assunto a=buscar(id); a.alterarNome(entrada.nome()); return repo.save(a);
 }
 @PatchMapping("/{id}/concluir") public Assunto concluir(@PathVariable long id) {
  Assunto a=buscar(id); a.concluir(); return repo.save(a);
 }
 @DeleteMapping("/{id}") public ResponseEntity<Void> excluir(@PathVariable long id) {
  repo.delete(buscar(id)); return ResponseEntity.noContent().build();
 }
 @ExceptionHandler(IllegalArgumentException.class)
 public ResponseEntity<String> invalido(IllegalArgumentException e) { return ResponseEntity.badRequest().body(e.getMessage()); }
}
