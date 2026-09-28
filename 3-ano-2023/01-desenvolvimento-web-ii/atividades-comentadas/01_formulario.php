<?php
/*
PHP, HTTP e validação no servidor
Autor: Gilmar da Silva Filho
Matéria: Desenvolvimento de Aplicação Web II
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: GET consulta recursos e POST envia dados. O servidor deve validar mesmo quando o HTML usa required. htmlspecialchars protege a saída de texto interpretado como HTML.
Objetivo: Receber nome e nota, rejeitar arrays ou nota fora de 0 a 10 e mostrar texto escapado.
Execução (nesta pasta): php -S 127.0.0.1:8000; abra http://127.0.0.1:8000/01_formulario.php
Pratique: Envie um nome com sinais < e > e confirme que o navegador mostra texto, sem executar marcação.
*/
$mensagem = '';
if (($_SERVER['REQUEST_METHOD'] ?? 'GET') === 'POST') {
    $nome = $_POST['nome'] ?? '';
    $entrada = $_POST['nota'] ?? null;
    $nota = is_string($entrada) ? filter_var($entrada, FILTER_VALIDATE_FLOAT) : false;
    if (!is_string($nome) || trim($nome) === '' || $nota === false || $nota < 0 || $nota > 10) {
        http_response_code(422);
        $mensagem = 'Informe nome e nota válida de 0 a 10.';
    } else {
        $mensagem = trim($nome) . ': nota ' . number_format($nota, 1, ',', '.');
    }
}
?>
<!doctype html><html lang="pt-BR"><meta charset="utf-8"><title>Notas</title>
<h1>Formulário de notas</h1><p>Gilmar da Silva Filho</p>
<form method="post">
<label>Nome <input name="nome" required maxlength="100"></label>
<label>Nota <input name="nota" type="number" min="0" max="10" step="0.1" required></label>
<button>Enviar</button></form>
<p role="status"><?= htmlspecialchars($mensagem, ENT_QUOTES, 'UTF-8') ?></p></html>
