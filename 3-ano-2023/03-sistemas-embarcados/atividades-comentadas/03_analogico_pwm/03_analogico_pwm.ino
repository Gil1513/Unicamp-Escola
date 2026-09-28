/*
Entrada analógica e PWM
Autor: Gilmar da Silva Filho
Matéria: Desenvolvimento para Sistemas Embarcados
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: analogRead lê o ADC; analogWrite no Uno ajusta o ciclo de trabalho de PWM, não uma tensão analógica contínua. Um potenciômetro em A0 controla o brilho de um LED no pino 9 com resistor.
Objetivo: Mapear a leitura 0–1023 para PWM 0–255 e exibir o valor na Serial.
Execução (nesta pasta): Compile para Arduino Uno; ligue o potenciômetro entre 5V/GND e cursor em A0; LED com resistor de 220 a 330 ohms no pino 9
Pratique: Calcule uma média de leituras para reduzir ruído e substitua o atraso por millis.
*/
const byte sensor = A0, led = 9;
void setup() { pinMode(led, OUTPUT); Serial.begin(9600); }
void loop() {
  int leitura = analogRead(sensor);
  int pwm = map(leitura, 0, 1023, 0, 255);
  analogWrite(led, pwm);
  Serial.println(pwm);
  delay(50);
}
