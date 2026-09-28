/* Luz automática com LDR e histerese
Gilmar da Silva — 201269
Conceitos: Divisor de tensão, analogRead, calibração, histerese e monitor serial.
Montagem e critérios: README.md desta pasta. Placa: Arduino Uno.
Desafio: Registre mínimo e máximo do sensor e calcule limites proporcionais ao ambiente.
*/

const byte sensor=A0, led=9;
bool ligado=false;
unsigned long leituraAnterior=0;
void setup() { pinMode(led,OUTPUT); Serial.begin(9600); }
void loop() {
  if(millis()-leituraAnterior<100) return;
  leituraAnterior=millis();
  int valor=analogRead(sensor);
  if(!ligado && valor<350) ligado=true;
  else if(ligado && valor>500) ligado=false;
  digitalWrite(led,ligado);
  Serial.print(valor); Serial.print(','); Serial.println(ligado);
}
