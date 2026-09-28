# Projetos Arduino — sequência de montagem

Gilmar da Silva — 201269

Todos os projetos usam Uno e bibliotecas do core AVR, sem dependências adicionais. Monte um por vez.

| Ordem | Projeto | Conteúdos |
|---|---|---|
| 1 | [Semáforo com máquina de estados](01_semaforo/README.md) | Saídas digitais, enum, switch, millis e temporização sem delay. |
| 2 | [Luz automática com LDR e histerese](02_luz_automatica/README.md) | Divisor de tensão, analogRead, calibração, histerese e monitor serial. |
| 3 | [Instrumento com potenciômetro e buzzer](03_instrumento/README.md) | Entrada analógica, map, tone, botão INPUT_PULLUP e condicionais. |
| 4 | [Medidor de distância com HC-SR04](04_distancia/README.md) | Pulso de disparo, duração, timeout, unidades e validação de leitura. |
| 5 | [Controle de LED por protocolo serial](05_comandos_serial/README.md) | Comunicação serial, buffer limitado, strings C e confirmação de comandos. |
| 6 | [Contador com debounce e EEPROM](06_contador_persistente/README.md) | Bordas, pull-up interno, debounce, unsigned long, memória não volátil e escrita sob comando. |

Pré-requisitos: tipos, if/else, laços, funções, arrays, pinos digitais e leitura analógica. Cada pasta contém esquema de ligações em tabela, código, procedimento de ensaio e desafio.

Referências: [exemplos oficiais](https://docs.arduino.cc/built-in-examples/), [linguagem](https://docs.arduino.cc/language-reference/), [EEPROM](https://docs.arduino.cc/learn/built-in-libraries/eeprom/).
