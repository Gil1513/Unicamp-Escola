# Trilha por conteúdo — Sistemas Operacionais e Redes de Computadores

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Programa, processo, pilha e fila | [Pilha de chamadas e fila de processos](atividades-comentadas/00-fundamentos/01_pilhas_processos.py) |
| Escalonamento | [Escalonamento FCFS](atividades-comentadas/01_escalonamento.py) |
| Memória e paginação | [Paginação e substituição FIFO](atividades-comentadas/02_memoria.py) |
| IPv4, máscaras e sub-redes | [IPv4 e pertencimento a uma sub-rede](atividades-comentadas/03_subredes.py) |
| URL, portas e protocolos | [Endereço, porta e protocolo](atividades-comentadas/00-fundamentos/02_protocolos.py) |
| TCP, cliente/servidor e mensagens | [Redes: cliente/servidor TCP e enquadramento](atividades-comentadas/20-aplicacao/03_socket_local.py) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Pilha de chamadas e fila de processos

Pilha segue LIFO; fila segue FIFO. São modelos de estruturas usadas pelo sistema, não processos reais.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/01_pilhas_processos.py`

Desafio: Simule rodízio de processos com quantidades diferentes de trabalho.

### Endereço, porta e protocolo

IP identifica uma interface; porta identifica um serviço de transporte. URL também contém protocolo, caminho e parâmetros.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/02_protocolos.py`

Desafio: Compare uma URL HTTPS sem porta explícita; pesquise a porta padrão.

### Escalonamento FCFS

First Come First Served atende por ordem de chegada, sem preempção. Espera = início menos chegada; retorno = fim menos chegada. A CPU pode ficar ociosa.

Execução a partir de `atividades-comentadas`: `python 01_escalonamento.py`

Desafio: Compare com uma ordem que priorize tarefas curtas; discuta o risco de espera prolongada.

### Paginação e substituição FIFO

Memória virtual divide endereços em páginas. Quando a página solicitada não está nos quadros disponíveis, ocorre falta de página. FIFO remove a página carregada há mais tempo, não a menos usada.

Execução a partir de `atividades-comentadas`: `python 02_memoria.py`

Desafio: Implemente LRU e compare com FIFO usando a mesma sequência.

### IPv4 e pertencimento a uma sub-rede

O prefixo /24 fixa 24 bits da rede. Rede e broadcast não são endereços de hosts nesse exemplo. Portas identificam serviços, enquanto IP identifica a interface.

Execução a partir de `atividades-comentadas`: `python 03_subredes.py`

Desafio: Compare /24 e /26. Por que /31 e /32 precisam de tratamento diferente?

### Redes: cliente/servidor TCP e enquadramento

TCP entrega fluxo de bytes, não mensagens completas. Um delimitador informa onde termina uma mensagem.

Execução a partir de `atividades-comentadas`: `python 20-aplicacao/03_socket_local.py`

Desafio: Envie a mensagem em duas partes e explique por que um único recv não é suficiente.
