# Validação das atividades

Verificação local em 28/09/2026. Os resultados se referem aos exemplos complementares e à organização, não a uma certificação de todos os exercícios antigos.

## Executado

- Python: exemplos de modelagem, informática, escalonamento, memória, redes, empreendedorismo, inventário, busca, hash e Git.
- SQLite: criação, consultas, rollback e rejeição de dados que violam CHECK ou chave estrangeira.
- C: cinco programas compilados com C11, `-Wall -Wextra -Werror`. Na conferência final, quatro executaram com a saída esperada; a execução do exemplo de estruturas e ponteiros foi bloqueada pelo Controle de Aplicativo do Windows (erro 4551). Não houve erro de compilação nesse exemplo.
- Java: três programas compilados e executados, com conferência das saídas.
- Projeto Integrador I: quatro testes, incluindo entradas inválidas, duplicidade e persistência.
- Projeto Integrador II: cinco testes de integração com HTTP real, banco temporário, entrada inválida, conflito e rota inexistente.
- Tópicos de TI: teste das duas buscas com seis cenários cada.
- JavaScript: sintaxe dos scripts dos exemplos HTML novos verificada com Node.js. Isso não substitui um teste de interação no navegador.
- C#: projeto de console executado; projeto Windows Forms compilado com zero avisos e zero erros. A interface gráfica não foi testada manualmente.
- Organização: presença dos arquivos originais/importados, cobertura das 15 disciplinas, links locais e ausência de colisões de nomes no Windows.

## Não executado neste ambiente

- C: execução final de `03_estruturas_e_ponteiros.c` bloqueada pela política do Windows, como descrito acima.
- PHP: runtime não localizado; exemplos revisados no código, sem validação de execução.
- Dart/Flutter: SDK não localizado; app, scripts e teste de widget preparados, mas não executados.
- Arduino: sketches não compilados nem testados em placa. A simulação em C foi executada.
- Projetos antigos com MySQL, Hibernate, Spring, .NET Framework ou recursos remotos: dependem de ambiente e configuração próprios. Os comentários e a reorganização não resolvem automaticamente essas dependências.
- GitHub Actions: workflow preparado; não houve envio nem execução remota nesta etapa.

## Reproduzir

Execute `python scripts/validar.py` na raiz. Opcionalmente informe `--gcc "caminho/do/gcc"` e `--relatorio resultado.json`. Ferramentas ausentes são marcadas como NÃO EXECUTADO; elas não são consideradas testes aprovados. O build C# usa os comandos do [guia de execução](COMO_EXECUTAR.md).
