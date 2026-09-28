# Trilha por conteúdo — Desenvolvimento para Sistemas Embarcados

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Bits, tipos e máscaras | [Bits, máscaras e registradores](atividades-comentadas/00-fundamentos/01_bits.c) |
| Sensor, conversão e histerese | [Conversão analógica e histerese](atividades-comentadas/01_sensor.c) |
| Digital, temporização e máquina de estados | [Semáforo com máquina de estados](atividades-comentadas/10-projetos-arduino/01_semaforo/01_semaforo.ino) |
| Entrada analógica, divisor e calibração | [Luz automática com LDR e histerese](atividades-comentadas/10-projetos-arduino/02_luz_automatica/02_luz_automatica.ino) |
| PWM | [Entrada analógica e PWM](atividades-comentadas/03_analogico_pwm/03_analogico_pwm.ino) |
| Botão, pull-up, map e som | [Instrumento com potenciômetro e buzzer](atividades-comentadas/10-projetos-arduino/03_instrumento/03_instrumento.ino) |
| Sensor de distância, pulso e timeout | [Medidor de distância com HC-SR04](atividades-comentadas/10-projetos-arduino/04_distancia/04_distancia.ino) |
| Serial, buffer, strings e protocolo | [Controle de LED por protocolo serial](atividades-comentadas/10-projetos-arduino/05_comandos_serial/05_comandos_serial.ino) |
| Debounce, bordas e EEPROM | [Contador com debounce e EEPROM](atividades-comentadas/10-projetos-arduino/06_contador_persistente/06_contador_persistente.ino) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Bits, máscaras e registradores

Uma máscara seleciona bits. OR liga, AND com complemento desliga, XOR alterna sem afetar os demais bits.

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 00-fundamentos/01_bits.c -o bits; ./bits`

Desafio: Reserve bits diferentes para dois sensores e um atuador.

### Conversão analógica e histerese

Um ADC de 10 bits retorna 0 a 1023. Histerese usa limites diferentes para ligar e desligar, reduzindo oscilações próximas a um limiar. Exemplo simulado, sem hardware.

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 01_sensor.c -o sensor; ./sensor`

Desafio: Converta a leitura em tensão para uma referência de 5 V e explique o erro de quantização.

### Entrada analógica e PWM

analogRead lê o ADC; analogWrite no Uno ajusta o ciclo de trabalho de PWM, não uma tensão analógica contínua. Um potenciômetro em A0 controla o brilho de um LED no pino 9 com resistor.

Execução a partir de `atividades-comentadas`: `Compile para Arduino Uno; ligue o potenciômetro entre 5V/GND e cursor em A0; LED com resistor de 220 a 330 ohms no pino 9`

Desafio: Calcule uma média de leituras para reduzir ruído e substitua o atraso por millis.

### Semáforo com máquina de estados

Saídas digitais, enum, switch, millis e temporização sem delay.

Execução a partir de `atividades-comentadas`: `Arduino IDE: abra 10-projetos-arduino/01_semaforo/01_semaforo.ino`

Desafio: Adicione um botão de pedido de travessia; só atenda quando terminar o verde e o amarelo.

### Luz automática com LDR e histerese

Divisor de tensão, analogRead, calibração, histerese e monitor serial.

Execução a partir de `atividades-comentadas`: `Arduino IDE: abra 10-projetos-arduino/02_luz_automatica/02_luz_automatica.ino`

Desafio: Registre mínimo e máximo do sensor e calcule limites proporcionais ao ambiente.

### Instrumento com potenciômetro e buzzer

Entrada analógica, map, tone, botão INPUT_PULLUP e condicionais.

Execução a partir de `atividades-comentadas`: `Arduino IDE: abra 10-projetos-arduino/03_instrumento/03_instrumento.ino`

Desafio: Divida a leitura em oito faixas e use um array com frequências de notas musicais.

### Medidor de distância com HC-SR04

Pulso de disparo, duração, timeout, unidades e validação de leitura.

Execução a partir de `atividades-comentadas`: `Arduino IDE: abra 10-projetos-arduino/04_distancia/04_distancia.ino`

Desafio: Filtre cinco medidas válidas pela mediana e compare a estabilidade perto de uma borda.

### Controle de LED por protocolo serial

Comunicação serial, buffer limitado, strings C e confirmação de comandos.

Execução a partir de `atividades-comentadas`: `Arduino IDE: abra 10-projetos-arduino/05_comandos_serial/05_comandos_serial.ino`

Desafio: Crie BRILHO 0..255 em um LED PWM, validando o número antes de aplicar analogWrite.

### Contador com debounce e EEPROM

Bordas, pull-up interno, debounce, unsigned long, memória não volátil e escrita sob comando.

Execução a partir de `atividades-comentadas`: `Arduino IDE: abra 10-projetos-arduino/06_contador_persistente/06_contador_persistente.ino`

Desafio: Adicione uma soma de verificação ao registro e trate memória corrompida; explique o limite de ciclos de escrita.

Consulte o [índice dos seis projetos Arduino](atividades-comentadas/10-projetos-arduino/README.md) para componentes, ligações e procedimento de ensaio.
