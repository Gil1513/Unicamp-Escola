# Desenvolvimento para Sistemas Embarcados

**Gilmar da Silva Filho | 2023 | 60 horas de formação profissional**

[Voltar ao índice](../../README.md)

## Sequência de estudo

1. Arduino.
2. entradas e saídas.
3. leitura analógica.
4. PWM.
5. temporização.
6. máquinas de estados.
7. sensores e atuadores.

Comece pela simulação em C sem placa. Depois use o LED interno para temporização e, por último, potenciômetro e PWM. Nos exemplos Arduino, use uma placa Uno e confira a pinagem antes de conectar os componentes.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Conversão analógica e histerese](atividades-comentadas/01_sensor.c) | Manter a saída ligada entre os limiares e desligar abaixo de 400. |
| 2 | [Temporização com millis e saída digital](atividades-comentadas/02_pisca_sem_bloqueio/02_pisca_sem_bloqueio.ino) | Alternar o LED interno a cada 500 ms sem usar delay. |
| 3 | [Entrada analógica e PWM](atividades-comentadas/03_analogico_pwm/03_analogico_pwm.ino) | Mapear a leitura 0–1023 para PWM 0–255 e exibir o valor na Serial. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Conversão analógica e histerese

`gcc -std=c11 -Wall -Wextra 01_sensor.c -o sensor; ./sensor`

**Conceitos:** Um ADC de 10 bits retorna 0 a 1023. Histerese usa limites diferentes para ligar e desligar, reduzindo oscilações próximas a um limiar. Exemplo simulado, sem hardware.

**Pratique:** Converta a leitura em tensão para uma referência de 5 V e explique o erro de quantização.

### Temporização com millis e saída digital

`Abra a pasta na Arduino IDE, selecione Arduino Uno e compile`

**Conceitos:** delay bloqueia o fluxo principal. Comparar millis com o instante anterior permite executar outras tarefas. Subtração sem sinal suporta o retorno do contador a zero.

**Pratique:** Adicione leitura de botão com INPUT_PULLUP e debounce, sem interromper a temporização.

### Entrada analógica e PWM

`Compile para Arduino Uno; ligue o potenciômetro entre 5V/GND e cursor em A0; LED com resistor de 220 a 330 ohms no pino 9`

**Conceitos:** analogRead lê o ADC; analogWrite no Uno ajusta o ciclo de trabalho de PWM, não uma tensão analógica contínua. Um potenciômetro em A0 controla o brilho de um LED no pino 9 com resistor.

**Pratique:** Calcule uma média de leituras para reduzir ruído e substitua o atraso por millis.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).
