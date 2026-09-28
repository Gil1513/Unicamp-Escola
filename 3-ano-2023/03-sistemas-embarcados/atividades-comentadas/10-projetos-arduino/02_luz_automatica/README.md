# Luz automática com LDR e histerese

Gilmar da Silva — 201269

**Placa:** Arduino Uno (5 V). **Conceitos:** Divisor de tensão, analogRead, calibração, histerese e monitor serial.

## Montagem

Desconecte o USB para montar. Use GND comum e resistor individual de 330 Ω em cada LED externo. Os pinos controlam somente os componentes indicados, não cargas de potência.

| Componente | Ligação |
|---|---|
| LDR | Uma ponta em 5 V; outra em A0 |
| Resistor 10 kΩ | Entre A0 e GND, formando divisor com o LDR |
| LED | D9 → 330 Ω → anodo; catodo → GND |

## Execução

Abra `02_luz_automatica.ino` na Arduino IDE, selecione Arduino Uno e a porta da placa, use Verificar e Carregar. No terminal, se houver Arduino CLI: `arduino-cli compile --fqbn arduino:avr:uno .`. Para enviar, acrescente `arduino-cli upload --fqbn arduino:avr:uno --port SUA_PORTA .`.

## Experimento e resultado esperado

Abra Serial em 9600. Cubra e ilumine o LDR; nessa montagem a leitura cai no escuro. Ajuste os limites às medições reais. O LED liga abaixo de 350 e só desliga acima de 500, evitando oscilação perto do limiar.

## Desafio

Registre mínimo e máximo do sensor e calcule limites proporcionais ao ambiente.

Registre montagem, entradas utilizadas, resultado observado e qualquer diferença em relação ao esperado. Uma compilação não substitui o teste na placa.
