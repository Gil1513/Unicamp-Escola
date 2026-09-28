/* Contador com debounce e EEPROM
Gilmar da Silva — 201269
Conceitos: Bordas, pull-up interno, debounce, unsigned long, memória não volátil e escrita sob comando.
Montagem e critérios: README.md desta pasta. Placa: Arduino Uno.
Desafio: Adicione uma soma de verificação ao registro e trate memória corrompida; explique o limite de ciclos de escrita.
*/

#include <EEPROM.h>
const byte botao=2;
const unsigned long assinatura=0x201269UL;
struct Registro { unsigned long marca; unsigned long contagem; };
unsigned long contador=0, mudouEm=0;
bool ultimaLeitura=HIGH, estavel=HIGH;
void salvar() {
  Registro r={assinatura,contador}; EEPROM.put(0,r);
  Serial.println("SALVO");
}
void setup() {
  pinMode(botao,INPUT_PULLUP); Serial.begin(9600);
  Registro r; EEPROM.get(0,r);
  if(r.marca==assinatura) contador=r.contagem;
  Serial.println(contador);
}
void loop() {
  bool leitura=digitalRead(botao);
  if(leitura!=ultimaLeitura) { ultimaLeitura=leitura; mudouEm=millis(); }
  if(millis()-mudouEm>=30 && leitura!=estavel) {
    estavel=leitura;
    if(estavel==LOW) { contador++; Serial.println(contador); }
  }
  if(Serial.available()) {
    char comando=Serial.read();
    if(comando=='S') salvar();
    else if(comando=='Z') { contador=0; salvar(); Serial.println(contador); }
  }
}
