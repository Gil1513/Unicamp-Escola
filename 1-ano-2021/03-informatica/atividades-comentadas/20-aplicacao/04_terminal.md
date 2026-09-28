# Windows/Linux, diretórios e documentos

Gilmar da Silva — 201269


Crie uma pasta **laboratorio-informatica** vazia e trabalhe somente nela. Objetivo: localizar, criar, copiar e inspecionar arquivos sem depender do explorador gráfico.

| Ação | PowerShell | Linux |
|---|---|---|
| Pasta atual | `Get-Location` | `pwd` |
| Listar | `Get-ChildItem` | `ls -la` |
| Subpasta | `New-Item -ItemType Directory notas` | `mkdir notas` |
| Entrar | `Set-Location notas` | `cd notas` |
| Criar texto | `'Gilmar da Silva' > aluno.txt` | `printf 'Gilmar da Silva\n' > aluno.txt` |
| Ler | `Get-Content aluno.txt` | `cat aluno.txt` |
| Copiar | `Copy-Item aluno.txt copia.txt` | `cp aluno.txt copia.txt` |
| Voltar | `Set-Location ..` | `cd ..` |

**Entrega:** árvore das pastas, um caminho absoluto, um relativo e o tamanho do texto em bytes. Execute o inventário CSV, importe-o em uma planilha e calcule SOMA da coluna de bytes. Explique extensão, codificação UTF-8 e a diferença entre nome exibido e formato real.

**Desafio:** compare permissões com `Get-Acl` ou `ls -l`, sem alterar permissões do sistema; explique leitura, escrita e execução. Documente uma estratégia de backup com uma cópia em outra unidade.
