# Instrumento com potenciômetro e buzzer

Gilmar da Silva — 201269

**Placa:** Arduino Uno (5 V). **Conceitos:** Entrada analógica, map, tone, botão INPUT_PULLUP e condicionais.

## Montagem

Desconecte o USB para montar. Use GND comum e resistor individual de 330 Ω em cada LED externo. Os pinos controlam somente os componentes indicados, não cargas de potência.

| Componente | Ligação |
|---|---|
| Potenciômetro 10 kΩ | Extremidades em 5 V/GND; cursor em A0 |
| Buzzer piezo passivo | Positivo em D8; negativo em GND |
| Botão | Entre D2 e GND; usa pull-up interno |

## Execução

Abra `03_instrumento.ino` na Arduino IDE, selecione Arduino Uno e a porta da placa, use Verificar e Carregar. No terminal, se houver Arduino CLI: `arduino-cli compile --fqbn arduino:avr:uno .`. Para enviar, acrescente `arduino-cli upload --fqbn arduino:avr:uno --port SUA_PORTA .`.

## Experimento e resultado esperado

Segure o botão e gire o potenciômetro: a frequência varia de 220 a 880 Hz. Solte o botão: o som deve parar. Use buzzer piezo passivo de baixa corrente, não alto-falante ou buzzer de potência.

## Desafio

Divida a leitura em oito faixas e use um array com frequências de notas musicais.

Registre montagem, entradas utilizadas, resultado observado e qualquer diferença em relação ao esperado. Uma compilação não substitui o teste na placa.
