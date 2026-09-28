# Validação das atividades

Verificação local em 28/09/2026, após a ampliação dos fundamentos.

## Resultado

O validador automático registrou **70 verificações aprovadas, 17 não executadas e nenhuma falha**. O [relatório detalhado](resultado-validacao.json) contém a saída de cada verificação.

- Python: execução dos exemplos e testes, incluindo critérios, estruturas de dados, limites, inventário e integração HTTP com SQLite temporário.
- SQLite: CRUD, relacionamentos, consultas, transações e restrições exercitados pelos scripts Python.
- C: oito programas compilados com C11, `-Wall -Wextra -Werror` e executados. Nesta rodada não houve bloqueio do Controle de Aplicativo do Windows.
- Java: cinco programas novos compilados e executados. Os projetos do acervo são independentes e não fazem parte desse total.
- JavaScript: o exercício de funções/arrays foi executado com asserções; scripts embutidos em HTML tiveram a sintaxe conferida. A interação no navegador não foi testada nesta rodada.
- C#: além do validador, `00-fundamentos/Fundamentos.csproj` foi restaurado e executado com .NET 10. Validou média, rejeição de entrada, lista vazia e dois eventos. Os projetos anteriores de console e Windows Forms foram executado/compilado na organização anterior; não houve novo teste manual da interface gráfica.
- Organização: presença dos arquivos do manifesto, cobertura das 15 matérias, links locais e ausência de colisões de caminhos no Windows.
- Importação Java: os 66 arquivos de `tbasso/java-cotil` tiveram os hashes comparados com o acervo de origem, sem alterações.

## Não executado

- PHP: cinco arquivos sem execução ou lint, pois o runtime não está instalado.
- Dart/Flutter: dez arquivos, incluindo dois exemplos de interface e testes de widget, sem execução por ausência do SDK.
- Arduino: dois sketches sem compilação nem teste físico. Os simuladores de bits, sensor e debounce foram executados.
- Projetos históricos com Spring, Hibernate, MySQL e .NET Framework requerem suas dependências e configurações. A renomeação do projeto Spring foi conferida nos caminhos, pacotes, classes e configurações; não foi realizado build com dependências nem conexão aos bancos antigos.
- O envio ao GitHub não confirma aprovação do workflow remoto. Consulte a aba Actions para o resultado de cada execução.

## Reproduzir

Na raiz: `python scripts/validar.py --relatorio docs/resultado-validacao.json`. Use `--gcc "caminho/do/gcc"` se necessário. Na pasta das atividades Desktop: `dotnet run --project 00-fundamentos/Fundamentos.csproj`. Na pasta `03-flutter`: `flutter test`; execute as telas com `flutter run -t lib/formulario.dart`, `flutter run -t lib/carregamento.dart` ou `flutter run`.

Ferramentas ausentes são registradas como NÃO EXECUTADO e não contam como testes aprovados.
