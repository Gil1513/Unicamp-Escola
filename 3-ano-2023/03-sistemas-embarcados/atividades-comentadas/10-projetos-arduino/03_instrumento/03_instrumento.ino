/* Instrumento com potenciômetro e buzzer
Gilmar da Silva — 201269
Conceitos: Entrada analógica, map, tone, botão INPUT_PULLUP e condicionais.
Montagem e critérios: README.md desta pasta. Placa: Arduino Uno.
Desafio: Divida a leitura em oito faixas e use um array com frequências de notas musicais.
*/

const byte pot=A0, buzzer=8, botao=2;
void setup() { pinMode(botao,INPUT_PULLUP); pinMode(buzzer,OUTPUT); }
void loop() {
  if(digitalRead(botao)==LOW) {
    int frequencia=map(analogRead(pot),0,1023,220,880);
    tone(buzzer,frequencia);
  } else noTone(buzzer);
}
