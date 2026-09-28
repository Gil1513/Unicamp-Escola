/*
Flutter: Form, validação, layout e ciclo de vida
Responsável: Gilmar da Silva
Conceitos: Form agrupa campos; validate chama os validadores. Controllers devem
ser descartados em dispose. SingleChildScrollView evita overflow com teclado.
Execute: flutter run -t lib/formulario.dart
Pratique: acrescente uma lista de matérias com DropdownButtonFormField.
*/
import 'package:flutter/material.dart';

void main() => runApp(const MaterialApp(home: FormularioEstudo()));

class FormularioEstudo extends StatefulWidget {
  const FormularioEstudo({super.key});
  @override
  State<FormularioEstudo> createState() => _FormularioEstudoState();
}

class _FormularioEstudoState extends State<FormularioEstudo> {
  final formulario = GlobalKey<FormState>();
  final assunto = TextEditingController();
  final minutos = TextEditingController();
  String resultado = '';

  @override
  void dispose() {
    assunto.dispose();
    minutos.dispose();
    super.dispose();
  }

  void salvar() {
    if (!formulario.currentState!.validate()) return;
    setState(() {
      resultado = '${assunto.text.trim()}: ${int.parse(minutos.text)} minutos';
    });
  }

  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Plano de estudo')),
    body: SingleChildScrollView(
      padding: const EdgeInsets.all(16),
      child: Center(child: ConstrainedBox(
        constraints: const BoxConstraints(maxWidth: 560),
        child: Form(key: formulario, child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            const Text('Gilmar da Silva — 201269'),
            const SizedBox(height: 16),
            TextFormField(
              key: const Key('assunto'), controller: assunto,
              decoration: const InputDecoration(labelText: 'Assunto'),
              validator: (valor) => (valor ?? '').trim().isEmpty
                  ? 'Informe o assunto.' : null,
            ),
            TextFormField(
              key: const Key('minutos'), controller: minutos,
              keyboardType: TextInputType.number,
              decoration: const InputDecoration(labelText: 'Minutos (1–240)'),
              validator: (valor) {
                final numero = int.tryParse(valor ?? '');
                return numero == null || numero < 1 || numero > 240
                    ? 'Use um inteiro de 1 a 240.' : null;
              },
            ),
            const SizedBox(height: 16),
            ElevatedButton(onPressed: salvar, child: const Text('Salvar')),
            Semantics(liveRegion: true, child: Text(resultado)),
          ],
        )),
      )),
    ),
  );
}
