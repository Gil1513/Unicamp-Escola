# Medidor de distância com HC-SR04

Gilmar da Silva — 201269

**Placa:** Arduino Uno (5 V). **Conceitos:** Pulso de disparo, duração, timeout, unidades e validação de leitura.

## Montagem

Desconecte o USB para montar. Use GND comum e resistor individual de 330 Ω em cada LED externo. Os pinos controlam somente os componentes indicados, não cargas de potência.

| HC-SR04 | Arduino Uno |
|---|---|
| VCC / GND | 5 V / GND |
| TRIG | D7 |
| ECHO | D6 |

Este circuito é para Uno de 5 V; ECHO de 5 V requer adaptação de nível em placas de 3,3 V.

## Execução

Abra `04_distancia.ino` na Arduino IDE, selecione Arduino Uno e a porta da placa, use Verificar e Carregar. No terminal, se houver Arduino CLI: `arduino-cli compile --fqbn arduino:avr:uno .`. Para enviar, acrescente `arduino-cli upload --fqbn arduino:avr:uno --port SUA_PORTA .`.

## Experimento e resultado esperado

Serial em 9600: posicione uma superfície plana a 10, 20 e 50 cm. Compare com uma régua. Sem eco em 30 ms, imprime SEM_ECO. O tempo corresponde à ida e volta; por isso a distância é dividida por dois.

## Desafio

Filtre cinco medidas válidas pela mediana e compare a estabilidade perto de uma borda.

Registre montagem, entradas utilizadas, resultado observado e qualquer diferença em relação ao esperado. Uma compilação não substitui o teste na placa.
