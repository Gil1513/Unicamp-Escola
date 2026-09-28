/*
Dart: interface, composição, JSON e repositório assíncrono
Gilmar da Silva — 201269
Conceitos: Um contrato desacopla a tela da persistência. JSON não garante formato; valide antes de construir o objeto.
Execute: dart run 20-aplicacao/03_repositorio_dart.dart
Desafio: Implemente um repositório HTTP e injete-o no carregador da tela Flutter existente.
*/

import 'dart:convert';
class Assunto {
  final String nome;
  Assunto(this.nome) { if(nome.trim().isEmpty) throw ArgumentError('Nome vazio'); }
  Map<String,dynamic> toJson()=>{'nome':nome};
  factory Assunto.fromJson(Map<String,dynamic> json) {
    if(json['nome'] is! String) throw FormatException('Nome deve ser texto');
    return Assunto(json['nome'] as String);
  }
}
abstract class Repositorio { Future<void> salvar(Assunto assunto); Future<List<Assunto>> listar(); }
class MemoriaJson implements Repositorio {
  final List<String> _dados=[];
  @override Future<void> salvar(Assunto assunto) async { _dados.add(jsonEncode(assunto.toJson())); }
  @override Future<List<Assunto>> listar() async => _dados.map((s)=>Assunto.fromJson(jsonDecode(s) as Map<String,dynamic>)).toList();
}
Future<void> main() async {
  final Repositorio repo=MemoriaJson(); await repo.salvar(Assunto('Flutter'));
  final lista=await repo.listar();
  if(lista.single.nome!='Flutter') throw StateError('Leitura incorreta');
  try { Assunto.fromJson({'nome':12}); throw StateError('Formato aceito'); }
  on FormatException { print('Formato inválido rejeitado'); }
  print(lista.single.toJson());
}
