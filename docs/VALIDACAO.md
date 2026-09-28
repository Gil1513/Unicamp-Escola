# Validação das atividades

Atualização de 28/09/2026, após as trilhas por conteúdo.

## Rotina geral

`python scripts/validar.py` registrou **99 verificações aprovadas e nenhuma falha**. O [relatório automático](resultado-validacao.json) inclui execução de Python, SQLite, C, Java e JavaScript, verificação de arquivos, links das trilhas e cobertura das 15 disciplinas.

A rotina geral registra 26 itens como NÃO EXECUTADO: sete PHP, onze Dart/Flutter e oito Arduino. **Os oito Arduino foram compilados separadamente**, como indicado abaixo. Isso não representa execução física dos circuitos.

## Projetos verificados separadamente

Veja o [relatório de projetos](resultado-projetos.json).

- **Java avançado:** `mvn test`, com Maven 3.9.9/JDK 26/Spring Boot 4.1.1, passou dois testes de integração. Um usa HTTP real para criar, consultar, editar, concluir e excluir via JPA/Hibernate, incluindo 400 e 404. Outro valida SQL parametrizado e rollback JDBC. O banco usado foi H2 em memória.
- **C#:** o novo projeto `20-aplicacao/Aplicacao.csproj` foi restaurado e executado com .NET 10. A gravação/leitura JSON assíncrona e o filtro LINQ retornaram o aluno esperado.
- **Arduino:** os oito sketches compilaram para `arduino:avr:uno`, com Arduino CLI 1.3.1 e core AVR 1.8.8. Foram verificados os dois anteriores e os seis novos projetos. Os logs registram memória ocupada.

## Limites da verificação

- Não houve montagem ou ensaio físico: sensores, precisão de distância, calibração do LDR e retenção real da EEPROM precisam ser conferidos na placa.
- PHP e Dart/Flutter não foram executados nesta máquina por ausência dos runtimes/SDKs.
- PostgreSQL e MySQL não foram usados nos testes; o projeto inclui drivers e roteiro de configuração para bases locais de laboratório.
- HTML/JavaScript tiveram revisão de código e verificação de sintaxe, sem teste interativo no navegador. O exercício Bootstrap depende da folha CSS por CDN.
- Projetos antigos/importados continuam com dependências e configurações próprias. Os novos testes não certificam todo o acervo.
- O job Maven foi adicionado ao workflow do GitHub, mas aprovação local não confirma execução remota.

## Reproduzir

Na raiz: `python scripts/validar.py --relatorio docs/resultado-validacao.json`. Se necessário, passe `--gcc "caminho/do/gcc"`.

Na pasta `10-trilha-java/03-api-banco`: `mvn test`. No novo projeto C#: `dotnet run --project Aplicacao.csproj`. Na pasta de cada sketch: `arduino-cli compile --fqbn arduino:avr:uno .`, após `arduino-cli core install arduino:avr`.

As instalações portáteis utilizadas na verificação ficaram fora do repositório; não são dependências ocultas do código. Cada projeto declara seus requisitos e comandos.
