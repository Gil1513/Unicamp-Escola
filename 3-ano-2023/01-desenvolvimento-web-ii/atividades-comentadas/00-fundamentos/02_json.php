<?php
/*
JSON, erros e resposta HTTP
Responsável: Gilmar da Silva
Conceitos: JSON representa dados para troca entre programas. Trate falhas de conversão e escape texto somente na saída HTML.
Execução: php 00-fundamentos/02_json.php
Pratique: Use esses dados em um endpoint GET e defina o Content-Type application/json.
*/
declare(strict_types=1);
$texto = '{"nome":"Gilmar da Silva","ra":201269}';
$dados = json_decode($texto, true, 512, JSON_THROW_ON_ERROR);
if ($dados['ra'] !== 201269) throw new RuntimeException('RA incorreto');
$json = json_encode($dados, JSON_UNESCAPED_UNICODE | JSON_THROW_ON_ERROR);
echo $json, PHP_EOL;
try { json_decode('{invalido}', true, 512, JSON_THROW_ON_ERROR); }
catch (JsonException $e) { echo 'JSON inválido rejeitado.', PHP_EOL; }
echo htmlspecialchars('<b>texto</b>', ENT_QUOTES, 'UTF-8'), PHP_EOL;
