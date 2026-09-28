/* Medidor de distância com HC-SR04
Gilmar da Silva — 201269
Conceitos: Pulso de disparo, duração, timeout, unidades e validação de leitura.
Montagem e critérios: README.md desta pasta. Placa: Arduino Uno.
Desafio: Filtre cinco medidas válidas pela mediana e compare a estabilidade perto de uma borda.
*/

const byte trigger=7, echo=6;
unsigned long ultima=0;
void setup() { pinMode(trigger,OUTPUT); pinMode(echo,INPUT); Serial.begin(9600); }
void loop() {
  if(millis()-ultima<100) return;
  ultima=millis();
  digitalWrite(trigger,LOW); delayMicroseconds(2);
  digitalWrite(trigger,HIGH); delayMicroseconds(10); digitalWrite(trigger,LOW);
  // pulseIn é bloqueante, mas o timeout limita a espera a 30 ms.
  unsigned long duracao=pulseIn(echo,HIGH,30000UL);
  if(duracao==0) { Serial.println("SEM_ECO"); return; }
  float cm=duracao*0.0343f/2.0f;
  if(cm<2 || cm>400) Serial.println("FORA_DA_FAIXA");
  else Serial.println(cm,1);
}
