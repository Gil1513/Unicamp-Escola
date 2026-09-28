# 12 — Git e GitHub: alteração revisável

Gilmar da Silva — 201269

Objetivo: versionar um exercício, comparar mudanças e revisar uma contribuição. Faça esta atividade em uma pasta de laboratório separada dos projetos existentes.

1. Crie uma pasta vazia, execute `git init -b main` e copie `Ambiente.java` para ela.
2. Crie `.gitignore` com `*.class` e `target/`. Execute `git add .`, `git diff --cached` e `git commit -m "Adiciona exercício de ambiente"`.
3. Execute `git switch -c exercicio/mensagem`. Altere a mensagem do programa, compile e execute.
4. Confira `git diff`, registre outro commit e compare com `git diff main...HEAD`.
5. Crie no seu GitHub um repositório vazio de laboratório. Use `git remote add origin URL_DO_SEU_REPOSITORIO` e `git push -u origin main`; depois `git push -u origin exercicio/mensagem`.
6. Abra um pull request no GitHub com objetivo, mudança e resultado da execução. Revise o diff, faça o merge e sincronize com `git switch main` e `git pull --ff-only`.

Critério: dois commits compreensíveis, arquivos compilados fora do Git e PR mostrando a alteração do programa. Não inclua senhas. Desafio: em outra branch, altere a mesma linha para praticar resolução de conflito em uma cópia local. Explique working tree, stage, commit, branch e remote.

Referências: [Git](https://git-scm.com/book/en/v2), [fluxo GitHub](https://docs.github.com/en/get-started/using-github/github-flow).
