/* Controle de LED por protocolo serial
Gilmar da Silva — 201269
Conceitos: Comunicação serial, buffer limitado, strings C e confirmação de comandos.
Montagem e critérios: README.md desta pasta. Placa: Arduino Uno.
Desafio: Crie BRILHO 0..255 em um LED PWM, validando o número antes de aplicar analogWrite.
*/

#include <string.h>
char buffer[20]; byte tamanho=0;
bool excedeu=false, ligado=false;
void executar() {
  buffer[tamanho]='\0';
  if(excedeu) Serial.println("ERRO_TAMANHO");
  else if(strcmp(buffer,"LIGAR")==0) { ligado=true; Serial.println("OK"); }
  else if(strcmp(buffer,"DESLIGAR")==0) { ligado=false; Serial.println("OK"); }
  else if(strcmp(buffer,"ESTADO")==0) Serial.println(ligado ? "LIGADO" : "DESLIGADO");
  else Serial.println("ERRO_COMANDO");
  digitalWrite(LED_BUILTIN,ligado);
  tamanho=0; excedeu=false;
}
void setup() { pinMode(LED_BUILTIN,OUTPUT); Serial.begin(9600); }
void loop() {
  while(Serial.available()>0) {
    char c=Serial.read();
    if(c=='\n') executar();
    else if(c!='\r' && !excedeu) {
      if(tamanho<sizeof(buffer)-1) buffer[tamanho++]=c;
      else excedeu=true;
    }
  }
}
