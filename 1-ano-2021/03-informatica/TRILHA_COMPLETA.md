# Trilha por conteúdo — Informática

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Windows/Linux, terminal, caminhos e permissões | [Windows/Linux, diretórios e documentos](atividades-comentadas/20-aplicacao/04_terminal.md) |
| Arquivos, diretórios e extensões | [Informática: caminhos, extensões e inventário de arquivos](atividades-comentadas/20-aplicacao/03_organizacao_documentos.py) |
| Codificação, bits e representação | [Bits, bytes e codificação de texto](atividades-comentadas/02_representacao.py) |
| CSV e planilhas | [Planilhas e dados tabulares](atividades-comentadas/00-fundamentos/01_csv.py) |
| Backup e conferência | [Cópia e conferência de arquivos](atividades-comentadas/00-fundamentos/02_backup.py) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Planilhas e dados tabulares

CSV separa campos por delimitadores; usar a biblioteca evita quebrar nomes com vírgulas.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/01_csv.py`

Desafio: Exporte um resumo e confira a diferença entre texto e número.

### Cópia e conferência de arquivos

Uma cópia deve ser conferida; hashes detectam alterações no conteúdo, mas não provam a autoria.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/02_backup.py`

Desafio: Explique por que uma cópia na mesma unidade não protege contra falha física.

### Bits, bytes e codificação de texto

Um byte possui 8 bits. UTF-8 usa quantidade variável de bytes por caractere; quantidade de caracteres não é necessariamente tamanho em bytes. KiB equivale a 1024 bytes.

Execução a partir de `atividades-comentadas`: `python 02_representacao.py`

Desafio: Teste um emoji e explique por que o tamanho em bytes aumenta.

### Informática: caminhos, extensões e inventário de arquivos

Separar nome, extensão e tamanho permite organizar documentos; operações ficam em diretório temporário.

Execução a partir de `atividades-comentadas`: `python 20-aplicacao/03_organizacao_documentos.py`

Desafio: Abra o CSV em uma planilha e filtre por extensão; compare caminho relativo e absoluto.

### Windows/Linux, diretórios e documentos

Windows/Linux, diretórios e documentos

Execução a partir de `atividades-comentadas`: `Siga o roteiro neste arquivo.`

Desafio: Complete o desafio final.
