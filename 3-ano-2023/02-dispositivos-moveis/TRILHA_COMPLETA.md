# Trilha por conteúdo — Desenvolvimento para Dispositivos Móveis

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Dart: tipos, funções, listas e null safety | [Dart: tipos, null safety, listas e funções](atividades-comentadas/00-fundamentos/01_dart.dart) |
| Classes e modelo | [Dart, null safety e modelo de tarefa](atividades-comentadas/01_modelo.dart) |
| Future, await e erros | [Future, await e tratamento de falhas](atividades-comentadas/00-fundamentos/02_async.dart) |
| JSON e persistência | [Operações assíncronas, JSON e persistência](atividades-comentadas/02_json_e_persistencia.dart) |
| Flutter: widgets, layout, formulário e validação | [Flutter: formulário e layout](atividades-comentadas/03-flutter/lib/formulario.dart) |
| Flutter: estado e navegação | [Interface, estado, validação e navegação](atividades-comentadas/03-flutter/lib/main.dart) |
| Flutter: carregamento, erro, vazio e nova tentativa | [Flutter: carregamento e navegação](atividades-comentadas/03-flutter/lib/carregamento.dart) |
| HTTP | [Consumindo uma API pela rede](atividades-comentadas/04_http.dart) |
| Interface de repositório, composição e serialização | [Dart: interface, composição, JSON e repositório assíncrono](atividades-comentadas/20-aplicacao/03_repositorio_dart.dart) |
| Testes de widget | [Flutter: testes de formulário e serviço](atividades-comentadas/03-flutter/test/fundamentos_test.dart) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Dart: tipos, null safety, listas e funções

String? aceita null. O operador ?? fornece um padrão; where e map transformam coleções sem alterar a original.

Execução a partir de `atividades-comentadas`: `dart run 00-fundamentos/01_dart.dart`

Desafio: Modele uma classe Aluno com RA imutável e notas privadas.

### Future, await e tratamento de falhas

Uma Future representa um resultado futuro. await aguarda esse resultado sem bloquear a interface; try/catch trata a falha.

Execução a partir de `atividades-comentadas`: `dart run 00-fundamentos/02_async.dart`

Desafio: Acrescente um timeout e diferencie timeout de erro de dados.

### Dart, null safety e modelo de tarefa

Classes agrupam estado e comportamento. Tipos não anuláveis evitam uso acidental de null. Métodos expressam ações válidas sobre o modelo.

Execução a partir de `atividades-comentadas`: `dart run 01_modelo.dart`

Desafio: Adicione uma prioridade enum e ordene tarefas por prioridade.

### Operações assíncronas, JSON e persistência

Future representa um resultado futuro; await permite aguardar sem bloquear o fluxo assíncrono. JSON é um formato de intercâmbio; validar a estrutura é necessário antes de usá-la.

Execução a partir de `atividades-comentadas`: `dart run 02_json_e_persistencia.dart`

Desafio: Troque a simulação por HttpClient, verificando status HTTP, timeout e falhas de conexão.

### Interface, estado, validação e navegação

Widgets descrevem a interface. setState solicita reconstrução após mudar o estado. Navigator empilha uma tela de detalhe; TextEditingController deve ser descartado.

Execução a partir de `atividades-comentadas`: `cd 03-flutter; flutter create --platforms=web,android .; flutter pub get; flutter run`

Desafio: Integre persistência e mostre estados de carregamento e erro ao buscar tarefas.

### Consumindo uma API pela rede

HttpClient envia uma requisição assíncrona. Status HTTP e timeout devem ser tratados. O JSON precisa ser validado antes de acessar os campos. Este exemplo usa a API de Projeto Integrador II.

Execução a partir de `atividades-comentadas`: `Inicie api.py de Projeto Integrador II; execute dart run 04_http.dart`

Desafio: Implemente POST e use um endereço configurável para executar fora do computador do servidor.

### Flutter: formulário e layout

Form, GlobalKey, validadores, controllers, layout responsivo e descarte de recursos.

Execução a partir de `atividades-comentadas`: `cd 03-flutter; flutter run -t lib/formulario.dart`

Desafio: Acrescente seleção de matéria e teste os limites de minutos.

### Flutter: carregamento e navegação

FutureBuilder, estados de espera/erro/vazio/sucesso, retry e injeção de dependência.

Execução a partir de `atividades-comentadas`: `cd 03-flutter; flutter run -t lib/carregamento.dart`

Desafio: Substitua o serviço simulado por HTTP com timeout.

### Flutter: testes de formulário e serviço

Widget tests simulam entrada, falha de serviço e recuperação.

Execução a partir de `atividades-comentadas`: `cd 03-flutter; flutter test`

Desafio: Teste voltar da tela de detalhes e editar um cadastro existente.

### Dart: interface, composição, JSON e repositório assíncrono

Um contrato desacopla a tela da persistência. JSON não garante formato; valide antes de construir o objeto.

Execução a partir de `atividades-comentadas`: `dart run 20-aplicacao/03_repositorio_dart.dart`

Desafio: Implemente um repositório HTTP e injete-o no carregador da tela Flutter existente.
