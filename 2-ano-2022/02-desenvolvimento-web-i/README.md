# Desenvolvimento de Aplicação Web I

**Gilmar da Silva | 2022 | 120 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

Veja a [trilha por conteúdo, com atividades e desafios](TRILHA_COMPLETA.md).

## Sequência de estudo

1. HTML semântico.
2. formulários.
3. CSS.
4. responsividade.
5. acessibilidade.
6. JavaScript.
7. DOM.
8. Bootstrap nos exercícios existentes.

Estude HTML e formulários antes de CSS, responsividade e eventos. No acervo, comece por `1Semestre-DAW` e siga para `2Semestre-DAW`; os projetos de Bootstrap aplicam a estrutura e o layout em páginas maiores. Exemplos com bibliotecas por CDN dependem de acesso à internet.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Formulário semântico e responsivo](atividades-comentadas/00-fundamentos/01_formulario.html) | Formulário semântico e responsivo |
| 2 | [Variáveis, funções, arrays e objetos](atividades-comentadas/00-fundamentos/02_javascript.js) | Variáveis, funções, arrays e objetos |
| 3 | [HTML semântico e formulários](atividades-comentadas/01_estrutura.html) | Navegar pelos campos com Tab e verificar bloqueio de nome vazio e quantidade negativa. |
| 4 | [CSS, box model e responsividade](atividades-comentadas/02_layout.html) | Exibir uma coluna em telas estreitas e três em telas maiores. |
| 5 | [DOM, eventos e armazenamento local](atividades-comentadas/03_dom.html) | Adicionar e concluir tarefas; recuperar a lista ao recarregar, quando o navegador permitir armazenamento local. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Formulário semântico e responsivo

`Abra 00-fundamentos/01_formulario.html no navegador`

**Conceitos:** label associa o rótulo ao campo; required e min fazem validação nativa. Grid adapta colunas e foco visível ajuda a navegação.

**Pratique:** Navegue apenas por teclado e teste a página em 320 e 1024 pixels.

### Variáveis, funções, arrays e objetos

`node 00-fundamentos/02_javascript.js`

**Conceitos:** const protege a referência, não o conteúdo. map transforma, filter seleciona e reduce agrega sem alterar o array original.

**Pratique:** Adicione uma busca por nome que ignore maiúsculas e espaços.

### HTML semântico e formulários

`Abra 01_estrutura.html no navegador`

**Conceitos:** HTML descreve significado. Cabeçalhos organizam a leitura; label associa o campo à descrição; required e min ajudam na validação inicial. Um servidor também deve validar.

**Pratique:** Adicione um campo de e-mail e explique a diferença entre name e id.

### CSS, box model e responsividade

`Abra 02_layout.html e redimensione a janela`

**Conceitos:** O box model soma conteúdo, padding e borda. Grid organiza cartões; uma media query adapta a apresentação à largura. Foco visível permite navegação pelo teclado.

**Pratique:** Adicione um quarto cartão e observe a distribuição sem posicionamento absoluto.

### DOM, eventos e armazenamento local

`Abra 03_dom.html no navegador`

**Conceitos:** O DOM representa a página em objetos. Eventos alteram o estado e a renderização. JSON converte a lista em texto para localStorage; dados lidos precisam de validação.

**Pratique:** Implemente remoção e um filtro de tarefas pendentes.

## Acervo anterior

[Explorar os arquivos anteriores](acervo/). A ordem sugerida acima orienta a revisão.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [Web: documentação de referência](https://developer.mozilla.org/en-US/docs/Learn_web_development/Core) — HTML semântico, formulários, CSS, layout, JavaScript, DOM e acessibilidade.
