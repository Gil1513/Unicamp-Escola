/*
Temporização com millis e saída digital
Autor: Gilmar da Silva Filho
Matéria: Desenvolvimento para Sistemas Embarcados
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: delay bloqueia o fluxo principal. Comparar millis com o instante anterior permite executar outras tarefas. Subtração sem sinal suporta o retorno do contador a zero.
Objetivo: Alternar o LED interno a cada 500 ms sem usar delay.
Execução (nesta pasta): Abra a pasta na Arduino IDE, selecione Arduino Uno e compile
Pratique: Adicione leitura de botão com INPUT_PULLUP e debounce, sem interromper a temporização.
*/
const unsigned long intervalo = 500;
unsigned long anterior = 0;
bool ligado = false;
void setup() { pinMode(LED_BUILTIN, OUTPUT); }
void loop() {
  unsigned long agora = millis();
  if (agora - anterior >= intervalo) {
    anterior = agora;
    ligado = !ligado;
    digitalWrite(LED_BUILTIN, ligado ? HIGH : LOW);
  }
}
