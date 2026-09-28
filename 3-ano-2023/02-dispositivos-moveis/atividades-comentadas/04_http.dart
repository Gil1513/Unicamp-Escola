/*
Consumindo uma API pela rede
Autor: Gilmar da Silva
Matéria: Desenvolvimento para Dispositivos Móveis
Conceitos: HttpClient envia uma requisição assíncrona. Status HTTP e timeout devem ser tratados. O JSON precisa ser validado antes de acessar os campos. Este exemplo usa a API de Projeto Integrador II.
Objetivo: Ler a lista de materiais do servidor local ou mostrar erro compreensível se estiver desligado.
Execução (nesta pasta): Inicie api.py de Projeto Integrador II; execute dart run 04_http.dart
Pratique: Implemente POST e use um endereço configurável para executar fora do computador do servidor.
*/
import 'dart:convert';
import 'dart:io';
import 'dart:async';

Future<void> main() async {
  final cliente = HttpClient()..connectionTimeout = const Duration(seconds: 5);
  try {
    final pedido = await cliente.getUrl(Uri.parse('http://127.0.0.1:8001/materiais'));
    final resposta = await pedido.close().timeout(const Duration(seconds: 5));
    if (resposta.statusCode != 200) throw HttpException('HTTP ${resposta.statusCode}');
    final texto = await resposta.transform(utf8.decoder).join().timeout(const Duration(seconds: 5));
    final dados = jsonDecode(texto);
    if (dados is! List) throw const FormatException('Esperada uma lista.');
    for (final item in dados) {
      if (item is! Map || item['nome'] is! String || item['quantidade'] is! int) {
        throw const FormatException('Material inválido.');
      }
      print('${item['nome']}: ${item['quantidade']}');
    }
    print('Total de materiais: ${dados.length}');
  } on SocketException catch (erro) {
    print('Não foi possível conectar: ${erro.message}'); exitCode = 1;
  } on HttpException catch (erro) {
    print('Erro do serviço: ${erro.message}'); exitCode = 1;
  } on TimeoutException {
    print('Tempo de espera esgotado.'); exitCode = 1;
  } on FormatException catch (erro) {
    print('Resposta inválida: ${erro.message}'); exitCode = 1;
  } finally { cliente.close(force: true); }
}
