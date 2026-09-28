/*
Flutter: FutureBuilder, estados da interface e injeção de dependência
Responsável: Gilmar da Silva
A Future é criada em initState, nunca em build, para não repetir a operação a
cada reconstrução. O carregador é injetado para testar sucesso, vazio e erro.
O serviço simulado não acessa a internet; 04_http.dart demonstra HTTP separado.
Execute: flutter run -t lib/carregamento.dart
Pratique: substitua carregarExemplo por uma chamada HTTP e adicione timeout.
*/
import 'package:flutter/material.dart';

Future<List<String>> carregarExemplo() async {
  await Future<void>.delayed(const Duration(milliseconds: 500));
  return ['Dart', 'Widgets', 'Estado', 'Navegação'];
}

void main() => runApp(MaterialApp(home: ListaAssuntos(carregar: carregarExemplo)));

class ListaAssuntos extends StatefulWidget {
  final Future<List<String>> Function() carregar;
  const ListaAssuntos({super.key, required this.carregar});
  @override
  State<ListaAssuntos> createState() => _ListaAssuntosState();
}

class _ListaAssuntosState extends State<ListaAssuntos> {
  late Future<List<String>> assuntos;
  @override
  void initState() {
    super.initState();
    assuntos = widget.carregar();
  }

  void tentarNovamente() => setState(() { assuntos = widget.carregar(); });

  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Assuntos de Flutter')),
    body: FutureBuilder<List<String>>(
      future: assuntos,
      builder: (context, snapshot) {
        if (snapshot.connectionState != ConnectionState.done) {
          return const Center(child: CircularProgressIndicator());
        }
        if (snapshot.hasError) {
          return Center(child: Column(mainAxisSize: MainAxisSize.min, children: [
            const Text('Não foi possível carregar.'),
            ElevatedButton(onPressed: tentarNovamente, child: const Text('Tentar novamente')),
          ]));
        }
        final dados = snapshot.data ?? [];
        if (dados.isEmpty) return const Center(child: Text('Nenhum assunto cadastrado.'));
        return ListView.builder(itemCount: dados.length, itemBuilder: (context, i) => ListTile(
          title: Text(dados[i]), trailing: const Icon(Icons.chevron_right),
          onTap: () => Navigator.of(context).push(MaterialPageRoute<void>(
            builder: (_) => Scaffold(
              appBar: AppBar(title: const Text('Detalhes')),
              body: Padding(padding: const EdgeInsets.all(16), child: Text(dados[i])),
            ),
          )),
        ));
      },
    ),
  );
}
