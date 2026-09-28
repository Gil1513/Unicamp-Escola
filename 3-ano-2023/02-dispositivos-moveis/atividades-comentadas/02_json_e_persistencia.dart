/*
Operações assíncronas, JSON e persistência
Autor: Gilmar da Silva Filho
Matéria: Desenvolvimento para Dispositivos Móveis
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Future representa um resultado futuro; await permite aguardar sem bloquear o fluxo assíncrono. JSON é um formato de intercâmbio; validar a estrutura é necessário antes de usá-la.
Objetivo: Simular a resposta de um serviço e salvar/recuperar uma tarefa em diretório temporário.
Execução (nesta pasta): dart run 02_json_e_persistencia.dart
Pratique: Troque a simulação por HttpClient, verificando status HTTP, timeout e falhas de conexão.
*/
import 'dart:convert';
import 'dart:io';

Future<String> consultarServicoSimulado() async {
  await Future<void>.delayed(const Duration(milliseconds: 10));
  return jsonEncode({'id': 1, 'titulo': 'Revisar Java'});
}
Future<void> main() async {
  final dados = jsonDecode(await consultarServicoSimulado());
  if (dados is! Map<String, dynamic> || dados['id'] is! int || dados['titulo'] is! String) {
    throw const FormatException('Resposta inválida.');
  }
  final pasta = await Directory.systemTemp.createTemp('cotil-mobile-');
  try {
    final arquivo = File('${pasta.path}/tarefa.json');
    await arquivo.writeAsString(jsonEncode(dados));
    print(jsonDecode(await arquivo.readAsString()));
  } finally { await pasta.delete(recursive: true); }
}
