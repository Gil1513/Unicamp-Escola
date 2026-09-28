/*
Interface, estado, validação e navegação
Autor: Gilmar da Silva
Matéria: Desenvolvimento para Dispositivos Móveis
Conceitos: Widgets descrevem a interface. setState solicita reconstrução após mudar o estado. Navigator empilha uma tela de detalhe; TextEditingController deve ser descartado.
Objetivo: Cadastrar assuntos, concluir itens e abrir os detalhes por toque; estado fica em memória.
Execução (nesta pasta): cd 03-flutter; flutter create --platforms=web,android .; flutter pub get; flutter run
Pratique: Integre persistência e mostre estados de carregamento e erro ao buscar tarefas.
*/
import 'package:flutter/material.dart';

void main() => runApp(const MaterialApp(home: Revisao()));
class Revisao extends StatefulWidget {
  const Revisao({super.key});
  @override State<Revisao> createState() => _RevisaoState();
}
class _RevisaoState extends State<Revisao> {
  final entrada = TextEditingController();
  final tarefas = <String>[];
  final concluidas = <int>{};
  @override void dispose() { entrada.dispose(); super.dispose(); }
  void adicionar() {
    final titulo = entrada.text.trim();
    if (titulo.isEmpty) {
      ScaffoldMessenger.of(context).showSnackBar(const SnackBar(content: Text('Informe um assunto.')));
      return;
    }
    setState(() => tarefas.add(titulo)); entrada.clear();
  }
  @override Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Revisão — Gilmar da Silva')),
    body: Padding(padding: const EdgeInsets.all(16), child: Column(children: [
      TextField(controller: entrada, decoration: const InputDecoration(labelText: 'Assunto'), onSubmitted: (_) => adicionar()),
      ElevatedButton(onPressed: adicionar, child: const Text('Adicionar')),
      Expanded(child: ListView.builder(itemCount: tarefas.length, itemBuilder: (context, i) => ListTile(
        leading: Checkbox(value: concluidas.contains(i), onChanged: (valor) => setState(() {
          if (valor == true) { concluidas.add(i); } else { concluidas.remove(i); }
        })),
        title: Text(tarefas[i]),
        onTap: () => Navigator.of(context).push(MaterialPageRoute<void>(builder: (_) => Scaffold(
          appBar: AppBar(title: const Text('Detalhes')),
          body: Padding(padding: const EdgeInsets.all(16), child: Text(tarefas[i])),
        ))),
      ))),
    ])),
  );
}
