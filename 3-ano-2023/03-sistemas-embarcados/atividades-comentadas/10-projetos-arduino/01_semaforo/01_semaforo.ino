/* Semáforo com máquina de estados
Gilmar da Silva — 201269
Conceitos: Saídas digitais, enum, switch, millis e temporização sem delay.
Montagem e critérios: README.md desta pasta. Placa: Arduino Uno.
Desafio: Adicione um botão de pedido de travessia; só atenda quando terminar o verde e o amarelo.
*/

enum Estado { VERMELHO, VERDE, AMARELO };
const byte vermelho=8, amarelo=9, verde=10;
Estado estado=VERMELHO;
unsigned long inicio=0;
void mostrar() {
  digitalWrite(vermelho,estado==VERMELHO);
  digitalWrite(verde,estado==VERDE);
  digitalWrite(amarelo,estado==AMARELO);
}
void setup() {
  pinMode(vermelho,OUTPUT); pinMode(amarelo,OUTPUT); pinMode(verde,OUTPUT);
  inicio=millis(); mostrar();
}
void loop() {
  unsigned long duracao=(estado==AMARELO ? 1000UL : 3000UL);
  if(millis()-inicio>=duracao) {
    switch(estado) {
      case VERMELHO: estado=VERDE; break;
      case VERDE: estado=AMARELO; break;
      case AMARELO: estado=VERMELHO; break;
    }
    inicio=millis(); mostrar();
  }
}
