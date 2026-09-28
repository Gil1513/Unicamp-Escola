/*
Teste da interação com a lista
Autor: Gilmar da Silva Filho
Matéria: Desenvolvimento para Dispositivos Móveis
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Um teste de widget monta a interface, simula entrada e eventos e verifica o estado visível. pump reconstrói o quadro após uma alteração.
Objetivo: Adicionar um assunto pela interface, concluir a tarefa e abrir a tela de detalhes.
Execução (nesta pasta): Na pasta 03-flutter: flutter test
Pratique: Adicione um teste para título vazio e confirme a mensagem de validação.
*/
import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:revisao_cotil/main.dart';

void main() {
  testWidgets('Cadastra, conclui e abre uma tarefa', (tester) async {
    await tester.pumpWidget(const MaterialApp(home: Revisao()));
    await tester.enterText(find.byType(TextField), 'Banco de Dados');
    await tester.tap(find.text('Adicionar'));
    await tester.pump();
    expect(find.text('Banco de Dados'), findsOneWidget);
    await tester.tap(find.byType(Checkbox));
    await tester.pump();
    expect(tester.widget<Checkbox>(find.byType(Checkbox)).value, isTrue);
    await tester.tap(find.text('Banco de Dados'));
    await tester.pumpAndSettle();
    expect(find.text('Detalhes'), findsOneWidget);
  });
}
