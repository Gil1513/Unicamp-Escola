/*
Dart, null safety e modelo de tarefa
Autor: Gilmar da Silva Filho
Matéria: Desenvolvimento para Dispositivos Móveis
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Classes agrupam estado e comportamento. Tipos não anuláveis evitam uso acidental de null. Métodos expressam ações válidas sobre o modelo.
Objetivo: Criar uma tarefa, concluí-la e rejeitar descrição vazia.
Execução (nesta pasta): dart run 01_modelo.dart
Pratique: Adicione uma prioridade enum e ordene tarefas por prioridade.
*/
class Tarefa {
  final String titulo;
  bool concluida = false;
  Tarefa(String titulo) : titulo = titulo.trim() {
    if (this.titulo.isEmpty) throw ArgumentError('Título obrigatório.');
  }
  void concluir() { concluida = true; }
}
void main() {
  final tarefa = Tarefa('Revisar banco de dados');
  tarefa.concluir();
  print('${tarefa.titulo}: ${tarefa.concluida}');
  try { Tarefa(' '); } on ArgumentError catch (erro) { print(erro.message); }
}
