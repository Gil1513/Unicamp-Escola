/*
Future, await e tratamento de falhas
Responsável: Gilmar da Silva
Conceitos: Uma Future representa um resultado futuro. await aguarda esse resultado sem bloquear a interface; try/catch trata a falha.
Execução: dart run 00-fundamentos/02_async.dart
Pratique: Acrescente um timeout e diferencie timeout de erro de dados.
*/
Future<List<String>> carregar({bool falhar = false}) async {
  await Future<void>.delayed(const Duration(milliseconds: 10));
  if (falhar) throw StateError('Falha simulada');
  return ['Dart', 'Flutter'];
}
Future<void> main() async {
  final assuntos = await carregar();
  if (assuntos.length != 2) throw StateError('Lista incorreta');
  print(assuntos);
  var erroTratado = false;
  try { await carregar(falhar: true); }
  on StateError { erroTratado = true; print('Tente novamente.'); }
  if (!erroTratado) throw StateError('Falha não tratada');
}
