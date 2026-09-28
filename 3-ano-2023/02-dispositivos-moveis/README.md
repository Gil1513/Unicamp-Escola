# Desenvolvimento para Dispositivos Móveis

**Gilmar da Silva | 2023 | 90 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

Veja a [trilha por conteúdo, com atividades e desafios](TRILHA_COMPLETA.md).

## Sequência de estudo

1. Dart.
2. interface Flutter.
3. estado.
4. validação.
5. navegação.
6. JSON.
7. operações assíncronas.
8. persistência.

Os exemplos de revisão usam Dart/Flutter como escolha complementar; a matriz curricular não especifica uma linguagem única. Siga modelo → Future/JSON/persistência → interface/estado/navegação → consumo HTTP. O aplicativo Flutter mantém a lista em memória; os exemplos separados demonstram persistência e rede para posterior integração.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Dart: tipos, null safety, listas e funções](atividades-comentadas/00-fundamentos/01_dart.dart) | Dart: tipos, null safety, listas e funções |
| 2 | [Future, await e tratamento de falhas](atividades-comentadas/00-fundamentos/02_async.dart) | Future, await e tratamento de falhas |
| 3 | [Dart, null safety e modelo de tarefa](atividades-comentadas/01_modelo.dart) | Criar uma tarefa, concluí-la e rejeitar descrição vazia. |
| 4 | [Operações assíncronas, JSON e persistência](atividades-comentadas/02_json_e_persistencia.dart) | Simular a resposta de um serviço e salvar/recuperar uma tarefa em diretório temporário. |
| 5 | [Interface, estado, validação e navegação](atividades-comentadas/03-flutter/lib/main.dart) | Cadastrar assuntos, concluir itens e abrir os detalhes por toque; estado fica em memória. |
| 6 | [Teste da interação com a lista](atividades-comentadas/03-flutter/test/widget_test.dart) | Adicionar um assunto pela interface, concluir a tarefa e abrir a tela de detalhes. |
| 7 | [Consumindo uma API pela rede](atividades-comentadas/04_http.dart) | Ler a lista de materiais do servidor local ou mostrar erro compreensível se estiver desligado. |
| 8 | [Flutter: formulário e layout](atividades-comentadas/03-flutter/lib/formulario.dart) | Flutter: formulário e layout |
| 9 | [Flutter: carregamento e navegação](atividades-comentadas/03-flutter/lib/carregamento.dart) | Flutter: carregamento e navegação |
| 10 | [Flutter: testes de formulário e serviço](atividades-comentadas/03-flutter/test/fundamentos_test.dart) | Flutter: testes de formulário e serviço |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Dart: tipos, null safety, listas e funções

`dart run 00-fundamentos/01_dart.dart`

**Conceitos:** String? aceita null. O operador ?? fornece um padrão; where e map transformam coleções sem alterar a original.

**Pratique:** Modele uma classe Aluno com RA imutável e notas privadas.

### Future, await e tratamento de falhas

`dart run 00-fundamentos/02_async.dart`

**Conceitos:** Uma Future representa um resultado futuro. await aguarda esse resultado sem bloquear a interface; try/catch trata a falha.

**Pratique:** Acrescente um timeout e diferencie timeout de erro de dados.

### Dart, null safety e modelo de tarefa

`dart run 01_modelo.dart`

**Conceitos:** Classes agrupam estado e comportamento. Tipos não anuláveis evitam uso acidental de null. Métodos expressam ações válidas sobre o modelo.

**Pratique:** Adicione uma prioridade enum e ordene tarefas por prioridade.

### Operações assíncronas, JSON e persistência

`dart run 02_json_e_persistencia.dart`

**Conceitos:** Future representa um resultado futuro; await permite aguardar sem bloquear o fluxo assíncrono. JSON é um formato de intercâmbio; validar a estrutura é necessário antes de usá-la.

**Pratique:** Troque a simulação por HttpClient, verificando status HTTP, timeout e falhas de conexão.

### Interface, estado, validação e navegação

`cd 03-flutter; flutter create --platforms=web,android .; flutter pub get; flutter run`

**Conceitos:** Widgets descrevem a interface. setState solicita reconstrução após mudar o estado. Navigator empilha uma tela de detalhe; TextEditingController deve ser descartado.

**Pratique:** Integre persistência e mostre estados de carregamento e erro ao buscar tarefas.

### Teste da interação com a lista

`Na pasta 03-flutter: flutter test`

**Conceitos:** Um teste de widget monta a interface, simula entrada e eventos e verifica o estado visível. pump reconstrói o quadro após uma alteração.

**Pratique:** Adicione um teste para título vazio e confirme a mensagem de validação.

### Consumindo uma API pela rede

`Inicie api.py de Projeto Integrador II; execute dart run 04_http.dart`

**Conceitos:** HttpClient envia uma requisição assíncrona. Status HTTP e timeout devem ser tratados. O JSON precisa ser validado antes de acessar os campos. Este exemplo usa a API de Projeto Integrador II.

**Pratique:** Implemente POST e use um endereço configurável para executar fora do computador do servidor.

### Flutter: formulário e layout

`cd 03-flutter; flutter run -t lib/formulario.dart`

**Conceitos:** Form, GlobalKey, validadores, controllers, layout responsivo e descarte de recursos.

**Pratique:** Acrescente seleção de matéria e teste os limites de minutos.

### Flutter: carregamento e navegação

`cd 03-flutter; flutter run -t lib/carregamento.dart`

**Conceitos:** FutureBuilder, estados de espera/erro/vazio/sucesso, retry e injeção de dependência.

**Pratique:** Substitua o serviço simulado por HTTP com timeout.

### Flutter: testes de formulário e serviço

`cd 03-flutter; flutter test`

**Conceitos:** Widget tests simulam entrada, falha de serviço e recuperação.

**Pratique:** Teste voltar da tela de detalhes e editar um cadastro existente.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [Dart: documentação de referência](https://dart.dev/language) — tipos, null safety, coleções, funções, classes e programação assíncrona.
- [Flutter: documentação de referência](https://docs.flutter.dev/learn/pathway/tutorial) — widgets, layout, entrada, estado, navegação e dados assíncronos.

### Trilha Flutter do terceiro ano

1. Dart básico e Future em `00-fundamentos`.
2. Modelo de dados, JSON e persistência nos scripts Dart.
3. `03-flutter/lib/formulario.dart`: layout, campos e validação.
4. `03-flutter/lib/main.dart`: lista, estado e navegação.
5. `03-flutter/lib/carregamento.dart`: espera, erro, lista vazia, resultado e nova tentativa.
6. `04_http.dart`: consumo de API; substitua o serviço simulado do app como exercício de integração.
7. `03-flutter/test`: testes de cadastro, limites, estado e recuperação de falha.

Na pasta `03-flutter`, execute `flutter test` e escolha a tela com `flutter run -t lib/formulario.dart` ou `flutter run -t lib/carregamento.dart`. Para a lista, use `flutter run`.
