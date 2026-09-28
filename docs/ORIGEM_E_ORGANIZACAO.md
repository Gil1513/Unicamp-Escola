# Origem e organização

Responsável pela organização e identificação das atividades: **Gilmar da Silva**.

## Arquivos

- 500 arquivos do acervo anterior foram realocados por matéria; o README da raiz foi reescrito.
- 292 arquivos foram incorporados de Atividades-Java.
- 34 arquivos foram incorporados de Daw-II.
- 227 arquivos gerados/configurações locais dos repositórios de origem não foram importados: classes compiladas, build/dist/target/out e dados privados de IDE. Os fontes, recursos, configurações de projeto e bibliotecas necessárias disponíveis foram preservados.
- 82 arquivos compõem os novos exemplos, testes e configurações das atividades complementares.
- 437 arquivos do acervo/importados receberam cabeçalhos de estudo; 135 campos de autor foram padronizados.

## Importações verificáveis

- [Atividades-Java](https://github.com/GilmardaSilva1/Atividades-Java) — commit `596c2749a8c98a1a74197d273ab38a67fde0dd9a`.
- [Daw-II](https://github.com/GilmardaSilva1/Daw-II) — commit `a64b4707d175bb38d175be9c621ea688c7d399cf`.
- [java-cotil.git](https://github.com/tbasso/java-cotil.git) — commit `562df1791dde20bd0c7cded0d794c87ecc1c466c`.

O repositório Java contém `ExemploMVC` e `exemploMVC`, nomes que colidem no Windows. Os blobs foram lidos diretamente do Git e preservados como `ExemploMVC-com-banco` e `ExemploMVC-basico`, respectivamente. Não se usou a cópia incompleta produzida pela colisão do checkout.

## Identificação e materiais de referência

Assinaturas dos exercícios foram padronizadas a pedido do responsável pelo repositório. Nomes de personagens, entidades ou dados de exemplo não são campos de autoria. PDFs, slides, imagens e bibliotecas do acervo permanecem como materiais de referência; sua organização não transfere a autoria desses materiais. Avisos de licença e copyright de fornecedores foram preservados.

O [manifesto](manifesto-organizacao.json) registra origem, caminho anterior, caminho atual e hash SHA-256 antes das alterações textuais. Isso permite conferir a presença e a proveniência dos arquivos. O [relatório de identificação](revisao-identificacao.json) lista os arquivos de código alterados.

Os comentários do acervo descrevem o papel do exemplo; não significam que todos os exercícios antigos estejam corrigidos ou compilados. O histórico Git original foi mantido. As atividades novas têm verificações e limitações descritas em [VALIDACAO.md](VALIDACAO.md).

Foram incorporados 66 arquivos de `tbasso/java-cotil`, com licença GPL-3.0 e créditos originais preservados. Os hashes desse acervo correspondem aos arquivos importados sem alterações. A padronização de autoria mencionada acima refere-se à organização anterior, não a esse novo acervo.

Na revisão atual, o projeto Spring foi renomeado para `demo_cadastro` (pacotes, classes e configuração). Identificadores CL numéricos foram substituídos por `201269`. Configurações de bancos antigos precisam corresponder ao ambiente local; não foram realizadas conexões aos servidores do acervo.
