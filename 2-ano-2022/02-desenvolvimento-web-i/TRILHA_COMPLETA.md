# Trilha por conteúdo — Desenvolvimento de Aplicação Web I

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| HTML semântico, formulários e validação | [Formulário semântico e responsivo](atividades-comentadas/00-fundamentos/01_formulario.html) |
| CSS, layout e responsividade | [CSS, box model e responsividade](atividades-comentadas/02_layout.html) |
| JavaScript: tipos, funções, arrays e objetos | [Variáveis, funções, arrays e objetos](atividades-comentadas/00-fundamentos/02_javascript.js) |
| DOM, eventos e acessibilidade | [DOM, eventos e armazenamento local](atividades-comentadas/03_dom.html) |
| Estado, JSON e armazenamento local | [Web: formulário, DOM, estado e localStorage](atividades-comentadas/20-aplicacao/03_estado_web.html) |

## Bootstrap

[Atividade de grid, componentes e breakpoints](atividades-comentadas/20-aplicacao/04_bootstrap.html). Compare uma coluna em 375 px com duas em 1024 px e resolva o desafio no comentário.

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Formulário semântico e responsivo

label associa o rótulo ao campo; required e min fazem validação nativa. Grid adapta colunas e foco visível ajuda a navegação.

Execução a partir de `atividades-comentadas`: `Abra 00-fundamentos/01_formulario.html no navegador`

Desafio: Navegue apenas por teclado e teste a página em 320 e 1024 pixels.

### Variáveis, funções, arrays e objetos

const protege a referência, não o conteúdo. map transforma, filter seleciona e reduce agrega sem alterar o array original.

Execução a partir de `atividades-comentadas`: `node 00-fundamentos/02_javascript.js`

Desafio: Adicione uma busca por nome que ignore maiúsculas e espaços.

### CSS, box model e responsividade

O box model soma conteúdo, padding e borda. Grid organiza cartões; uma media query adapta a apresentação à largura. Foco visível permite navegação pelo teclado.

Execução a partir de `atividades-comentadas`: `Abra 02_layout.html e redimensione a janela`

Desafio: Adicione um quarto cartão e observe a distribuição sem posicionamento absoluto.

### DOM, eventos e armazenamento local

O DOM representa a página em objetos. Eventos alteram o estado e a renderização. JSON converte a lista em texto para localStorage; dados lidos precisam de validação.

Execução a partir de `atividades-comentadas`: `Abra 03_dom.html no navegador`

Desafio: Implemente remoção e um filtro de tarefas pendentes.

### Web: formulário, DOM, estado e localStorage

Eventos alteram o estado, renderização atualiza a tela e JSON permite salvar uma lista entre visitas.

Execução a partir de `atividades-comentadas`: `Abra 20-aplicacao/03_estado_web.html no navegador`

Desafio: Recarregue a página, remova um item e tente inserir marcação HTML; explique o uso de textContent.
