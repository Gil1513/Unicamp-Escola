# Contador com debounce e EEPROM

Gilmar da Silva — 201269

**Placa:** Arduino Uno (5 V). **Conceitos:** Bordas, pull-up interno, debounce, unsigned long, memória não volátil e escrita sob comando.

## Montagem

Desconecte o USB para montar. Use GND comum e resistor individual de 330 Ω em cada LED externo. Os pinos controlam somente os componentes indicados, não cargas de potência.

Botão entre D2 e GND. O pull-up interno mantém HIGH quando solto. Serial em 9600; envie S para salvar a contagem ou Z para zerar a memória.

## Execução

Abra `06_contador_persistente.ino` na Arduino IDE, selecione Arduino Uno e a porta da placa, use Verificar e Carregar. No terminal, se houver Arduino CLI: `arduino-cli compile --fqbn arduino:avr:uno .`. Para enviar, acrescente `arduino-cli upload --fqbn arduino:avr:uno --port SUA_PORTA .`.

## Experimento e resultado esperado

Cada pressionamento estável por 30 ms soma um. Segurar o botão não deve repetir. Conte três, envie S, reinicie a placa e confira que três foi recuperado. A EEPROM é escrita apenas ao salvar/zerar, evitando gravar continuamente no loop.

## Desafio

Adicione uma soma de verificação ao registro e trate memória corrompida; explique o limite de ciclos de escrita.

Registre montagem, entradas utilizadas, resultado observado e qualquer diferença em relação ao esperado. Uma compilação não substitui o teste na placa.
