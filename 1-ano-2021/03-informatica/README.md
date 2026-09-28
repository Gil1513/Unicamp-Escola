# Informática

**Gilmar da Silva Filho | 2021 | 30 horas de formação profissional**

[Voltar ao índice](../../README.md)

## Sequência de estudo

1. Windows e Linux.
2. arquivos e diretórios.
3. caminhos.
4. organização de documentos.
5. representação de dados.

No Windows/PowerShell, pratique `Get-Location`, `Get-ChildItem`, `Set-Location` e `Get-Content` em uma pasta de exercícios. No Linux, compare com `pwd`, `ls`, `cd` e `cat`. Diferencie arquivo, diretório, extensão, caminho absoluto e relativo antes dos exemplos Python.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Arquivos, diretórios e caminhos portáveis](atividades-comentadas/01_arquivos_e_caminhos.py) | Criar, ler e listar documentos em um diretório temporário, removido automaticamente. |
| 2 | [Bits, bytes e codificação de texto](atividades-comentadas/02_representacao.py) | Mostrar 13 em binário e comparar os caracteres e bytes de ação. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Arquivos, diretórios e caminhos portáveis

`python 01_arquivos_e_caminhos.py`

**Conceitos:** Diretórios organizam arquivos; um caminho relativo depende do diretório atual. pathlib evita concatenar separadores diferentes no Windows e no Linux.

**Pratique:** Crie subpastas por matéria e compare caminho absoluto com caminho relativo.

### Bits, bytes e codificação de texto

`python 02_representacao.py`

**Conceitos:** Um byte possui 8 bits. UTF-8 usa quantidade variável de bytes por caractere; quantidade de caracteres não é necessariamente tamanho em bytes. KiB equivale a 1024 bytes.

**Pratique:** Teste um emoji e explique por que o tamanho em bytes aumenta.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).
