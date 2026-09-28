# Como executar

Os comandos partem da pasta da atividade. No Windows, use aspas ao navegar por pastas que contêm espaços. Cada programa é independente; nomes repetidos como `Main`, `Aluno` ou `Program` pertencem a projetos diferentes.

## Python e SQL

Use Python 3.10 ou superior; os exemplos usam apenas bibliotecas padrão. Execute `python nome_do_arquivo.py` (ou `py nome_do_arquivo.py` no Windows). Para SQL, use `python executar_sql.py`: o laboratório cria um banco SQLite em memória. Não execute os arquivos SQLite diretamente em MySQL sem adaptar o dialeto.

## C

Use GCC com suporte a C11. Exemplo:

```powershell
gcc -std=c11 -Wall -Wextra 01_decisoes_e_lacos.c -o notas.exe
.\notas.exe
```

No Linux, use `./notas`. Os binários antigos do acervo não são necessários para estudar; prefira compilar o fonte. Alguns exercícios antigos usam funções legadas como `gets` ou dependências de Windows e não foram modernizados nesta organização.

## Java

Para os três exemplos novos, use JDK 17 ou superior e `java 01-poo/ContaDemo.java`. Alternativamente, entre na pasta, execute `javac -encoding UTF-8 ContaDemo.java` e `java ContaDemo`.

Nos projetos NetBeans do acervo/importados, abra a pasta com `build.xml` e `nbproject`; compile cada projeto separadamente. Arquivos `.form` pertencem ao editor visual e acompanham o `.java`. Projetos JDBC precisam do driver e do esquema MySQL configurados; Hibernate precisa de suas bibliotecas e mapeamentos. Projetos Spring usam o `pom.xml` e seu wrapper Maven. Não há garantia de que caminhos de bibliotecas e serviços antigos existam no computador atual.

## C#

Os projetos complementares usam SDK .NET 10. Na pasta de atividades:

```powershell
dotnet run --project 01-console
dotnet run --project 02-interface
```

O segundo exige Windows e suporte a Windows Forms. Os projetos anteriores usam .NET Framework e devem ser abertos individualmente no Visual Studio com suas dependências. A pasta de bibliotecas de `ProjetoEstudio` foi preservada.

## HTML, CSS e JavaScript

Abra os arquivos `.html` no navegador. Para comportamento consistente do armazenamento local, também pode servir a pasta com `python -m http.server 8080 --bind 127.0.0.1` e abrir `http://127.0.0.1:8080`. Esse servidor estático não executa PHP. Bibliotecas por CDN e imagens remotas dos exemplos antigos exigem internet.

## PHP

Use PHP 8.1 ou superior. Para o exemplo de banco, habilite PDO e `pdo_sqlite`. Na pasta dos exemplos, execute:

```powershell
php -S 127.0.0.1:8000
```

Abra `http://127.0.0.1:8000/01_formulario.php` ou `/02_sessoes.php`. O exemplo de sessão informa uma conta pública de demonstração; é um laboratório local. `php 03_pdo.php` executa o CRUD em memória no terminal. Nos exercícios antigos, confira caminhos de `include`, formulários e extensões necessárias.

## Dart e Flutter

Use Dart 3 e Flutter compatível. Os scripts Dart de console podem ser executados com `dart run arquivo.dart`. Na pasta `03-flutter`, gere os diretórios de plataforma se necessário, mantendo os fontes fornecidos:

```powershell
flutter create --platforms=web,android --project-name revisao_cotil .
flutter pub get
flutter run
```

O teste `test/widget_test.dart` fornecido já usa a classe `Revisao`; preserve esse arquivo e execute `flutter test`. O aplicativo fornecido é um exemplo de lista em memória. Persistência e HTTP são exemplos separados de integração. Para `04_http.dart`, inicie antes a API do Integrador II. Em um dispositivo físico ou emulador, `127.0.0.1` se refere ao próprio dispositivo: configure o endereço do servidor conforme o ambiente.

## Arduino

Abra cada pasta que contém seu `.ino` na Arduino IDE; o nome da pasta e o do sketch devem coincidir. Selecione Arduino Uno, confira a porta e compile. O exemplo com LED interno não requer circuito externo. O de PWM usa potenciômetro em A0 e LED com resistor no pino 9. A simulação `01_sensor.c` funciona sem placa.

## Projetos integradores

No Integrador I: `python inventario.py` e `python -m unittest discover -s . -p test_inventario.py -v`.

No Integrador II: `python api.py` em um terminal e `python cliente.py` em outro. O servidor escuta apenas em `127.0.0.1:8001`. O arquivo `inventario.sqlite3` fica ao lado da API e é ignorado pelo Git. Encerre com Ctrl+C. Os testes `python -m unittest discover -s . -p test_api.py -v` usam porta livre e banco temporário, sem precisar iniciar a API manualmente.

## Validação geral

Na raiz: `python scripts/validar.py`. O script executa os exemplos Python, compila os novos exemplos Java/C quando há compiladores, verifica JavaScript e registra explicitamente as verificações não executadas. Use `--gcc "caminho/do/gcc"` para indicar um compilador fora do PATH e `--relatorio caminho.json` para salvar os resultados.

## Novas trilhas

Java possui programas isolados em `10-trilha-java/01-basico` e `02-poo`, e um projeto Maven em `03-api-banco`: execute `mvn test` nessa pasta. Não compile as classes Spring individualmente com javac. A instalação do JDK, IDE e Maven está explicada no README da trilha.

Os seis projetos Arduino estão em `10-projetos-arduino`, cada um com pasta e sketch do mesmo nome, montagem e roteiro de ensaio. Use Arduino Uno. O novo laboratório C# usa `dotnet run --project 20-aplicacao/Aplicacao.csproj`. O cliente fetch de DAW II deve ser aberto pelo servidor PHP, não como arquivo local.
