# Controle de LED por protocolo serial

Gilmar da Silva — 201269

**Placa:** Arduino Uno (5 V). **Conceitos:** Comunicação serial, buffer limitado, strings C e confirmação de comandos.

## Montagem

Desconecte o USB para montar. Use GND comum e resistor individual de 330 Ω em cada LED externo. Os pinos controlam somente os componentes indicados, não cargas de potência.

Usa apenas o LED integrado em D13. Abra o monitor serial em 9600 e selecione final de linha Nova linha.

## Execução

Abra `05_comandos_serial.ino` na Arduino IDE, selecione Arduino Uno e a porta da placa, use Verificar e Carregar. No terminal, se houver Arduino CLI: `arduino-cli compile --fqbn arduino:avr:uno .`. Para enviar, acrescente `arduino-cli upload --fqbn arduino:avr:uno --port SUA_PORTA .`.

## Experimento e resultado esperado

Envie LIGAR, DESLIGAR e ESTADO. Espere OK ou o estado atual. Comando desconhecido retorna ERRO_COMANDO; mais de 19 caracteres retorna ERRO_TAMANHO e descarta a linha inteira.

## Desafio

Crie BRILHO 0..255 em um LED PWM, validando o número antes de aplicar analogWrite.

Registre montagem, entradas utilizadas, resultado observado e qualquer diferença em relação ao esperado. Uma compilação não substitui o teste na placa.
