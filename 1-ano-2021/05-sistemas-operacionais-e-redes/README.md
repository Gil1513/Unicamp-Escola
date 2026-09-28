# Sistemas Operacionais e Redes de Computadores

**Gilmar da Silva Filho | 2021 | 60 horas de formação profissional**

[Voltar ao índice](../../README.md)

## Sequência de estudo

1. Processos.
2. escalonamento.
3. memória.
4. redes IPv4.
5. sub-redes.
6. portas e protocolos.

Comece distinguindo programa, processo e sistema operacional; depois compare execução sequencial e concorrente. Estude FCFS, paginação, IPv4, máscara, rede, host e serviços. Os simuladores não alteram a configuração real do computador ou da rede.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Escalonamento FCFS](atividades-comentadas/01_escalonamento.py) | Calcular espera e retorno e tratar um intervalo sem processos prontos. |
| 2 | [Paginação e substituição FIFO](atividades-comentadas/02_memoria.py) | Simular três quadros e contar 9 faltas na sequência de referência. |
| 3 | [IPv4 e pertencimento a uma sub-rede](atividades-comentadas/03_subredes.py) | Obter 254 hosts em 192.168.10.0/24 e identificar um endereço de fora da rede. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Escalonamento FCFS

`python 01_escalonamento.py`

**Conceitos:** First Come First Served atende por ordem de chegada, sem preempção. Espera = início menos chegada; retorno = fim menos chegada. A CPU pode ficar ociosa.

**Pratique:** Compare com uma ordem que priorize tarefas curtas; discuta o risco de espera prolongada.

### Paginação e substituição FIFO

`python 02_memoria.py`

**Conceitos:** Memória virtual divide endereços em páginas. Quando a página solicitada não está nos quadros disponíveis, ocorre falta de página. FIFO remove a página carregada há mais tempo, não a menos usada.

**Pratique:** Implemente LRU e compare com FIFO usando a mesma sequência.

### IPv4 e pertencimento a uma sub-rede

`python 03_subredes.py`

**Conceitos:** O prefixo /24 fixa 24 bits da rede. Rede e broadcast não são endereços de hosts nesse exemplo. Portas identificam serviços, enquanto IP identifica a interface.

**Pratique:** Compare /24 e /26. Por que /31 e /32 precisam de tratamento diferente?

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).
