/*
Dart: tipos, null safety, listas e funções
Responsável: Gilmar da Silva
Conceitos: String? aceita null. O operador ?? fornece um padrão; where e map transformam coleções sem alterar a original.
Execução: dart run 00-fundamentos/01_dart.dart
Pratique: Modele uma classe Aluno com RA imutável e notas privadas.
*/
double media(List<double> notas) {
  if (notas.isEmpty || notas.any((n) => !n.isFinite || n < 0 || n > 10)) {
    throw ArgumentError('Notas inválidas');
  }
  return notas.reduce((a, b) => a + b) / notas.length;
}
void main() {
  String? apelido;
  final nome = apelido ?? 'Gilmar da Silva';
  final notas = <double>[6, 8, 10];
  if (media(notas) != 8) throw StateError('Média incorreta');
  print('$nome: ${media(notas)}');
  print(notas.where((n) => n >= 8).map((n) => 'Nota $n').toList());
  try { media([]); throw StateError('Vazio aceito'); }
  on ArgumentError { print('Lista vazia rejeitada'); }
}
