# Semáforo com máquina de estados

Gilmar da Silva — 201269

**Placa:** Arduino Uno (5 V). **Conceitos:** Saídas digitais, enum, switch, millis e temporização sem delay.

## Montagem

Desconecte o USB para montar. Use GND comum e resistor individual de 330 Ω em cada LED externo. Os pinos controlam somente os componentes indicados, não cargas de potência.

| Componente | Ligação |
|---|---|
| LED vermelho | D8 → resistor 330 Ω → anodo; catodo → GND |
| LED amarelo | D9 → resistor 330 Ω → anodo; catodo → GND |
| LED verde | D10 → resistor 330 Ω → anodo; catodo → GND |

## Execução

Abra `01_semaforo.ino` na Arduino IDE, selecione Arduino Uno e a porta da placa, use Verificar e Carregar. No terminal, se houver Arduino CLI: `arduino-cli compile --fqbn arduino:avr:uno .`. Para enviar, acrescente `arduino-cli upload --fqbn arduino:avr:uno --port SUA_PORTA .`.

## Experimento e resultado esperado

Ao ligar, vermelho por 3 s, verde por 3 s e amarelo por 1 s. Observe três ciclos: somente um LED deve ficar ligado por vez. A subtração unsigned de millis também funciona quando o contador transborda.

## Desafio

Adicione um botão de pedido de travessia; só atenda quando terminar o verde e o amarelo.

Registre montagem, entradas utilizadas, resultado observado e qualquer diferença em relação ao esperado. Uma compilação não substitui o teste na placa.
