# Desenvolvimento para Dispositivos Móveis

**Gilmar da Silva Filho | 2023 | 90 horas de formação profissional**

[Voltar ao índice](../../README.md)

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
| 1 | [Dart, null safety e modelo de tarefa](atividades-comentadas/01_modelo.dart) | Criar uma tarefa, concluí-la e rejeitar descrição vazia. |
| 2 | [Operações assíncronas, JSON e persistência](atividades-comentadas/02_json_e_persistencia.dart) | Simular a resposta de um serviço e salvar/recuperar uma tarefa em diretório temporário. |
| 3 | [Interface, estado, validação e navegação](atividades-comentadas/03-flutter/lib/main.dart) | Cadastrar assuntos, concluir itens e abrir os detalhes por toque; estado fica em memória. |
| 4 | [Teste da interação com a lista](atividades-comentadas/03-flutter/test/widget_test.dart) | Adicionar um assunto pela interface, concluir a tarefa e abrir a tela de detalhes. |
| 5 | [Consumindo uma API pela rede](atividades-comentadas/04_http.dart) | Ler a lista de materiais do servidor local ou mostrar erro compreensível se estiver desligado. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

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

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).
