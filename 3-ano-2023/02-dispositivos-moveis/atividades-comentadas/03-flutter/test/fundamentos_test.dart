// Testes de formulário e estados assíncronos — Gilmar da Silva.
// Execute na pasta 03-flutter: flutter test
import 'dart:async';
import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:revisao_cotil/formulario.dart';
import 'package:revisao_cotil/carregamento.dart';

void main() {
  testWidgets('Rejeita vazio e minutos fora do limite; aceita cadastro', (tester) async {
    await tester.pumpWidget(const MaterialApp(home: FormularioEstudo()));
    await tester.tap(find.text('Salvar'));
    await tester.pump();
    expect(find.text('Informe o assunto.'), findsOneWidget);
    await tester.enterText(find.byKey(const Key('assunto')), 'Widgets');
    await tester.enterText(find.byKey(const Key('minutos')), '241');
    await tester.tap(find.text('Salvar'));
    await tester.pump();
    expect(find.text('Use um inteiro de 1 a 240.'), findsOneWidget);
    await tester.enterText(find.byKey(const Key('minutos')), '30');
    await tester.tap(find.text('Salvar'));
    await tester.pump();
    expect(find.text('Widgets: 30 minutos'), findsOneWidget);
  });

  testWidgets('Mostra espera, dados e navega para detalhe', (tester) async {
    final resposta = Completer<List<String>>();
    await tester.pumpWidget(MaterialApp(home: ListaAssuntos(carregar: () => resposta.future)));
    expect(find.byType(CircularProgressIndicator), findsOneWidget);
    resposta.complete(['Dart']);
    await tester.pumpAndSettle();
    await tester.tap(find.text('Dart'));
    await tester.pumpAndSettle();
    expect(find.text('Detalhes'), findsOneWidget);
  });

  testWidgets('Mostra lista vazia', (tester) async {
    await tester.pumpWidget(MaterialApp(home: ListaAssuntos(carregar: () async => [])));
    await tester.pumpAndSettle();
    expect(find.text('Nenhum assunto cadastrado.'), findsOneWidget);
  });

  testWidgets('Trata erro e permite tentar novamente', (tester) async {
    var tentativas = 0;
    Future<List<String>> carregar() async {
      if (++tentativas == 1) throw StateError('Indisponível');
      return ['Flutter'];
    }
    await tester.pumpWidget(MaterialApp(home: ListaAssuntos(carregar: carregar)));
    await tester.pumpAndSettle();
    expect(find.text('Não foi possível carregar.'), findsOneWidget);
    await tester.tap(find.text('Tentar novamente'));
    await tester.pumpAndSettle();
    expect(find.text('Flutter'), findsOneWidget);
    expect(tentativas, 2);
  });
}
