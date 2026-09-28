<?php
/*
PHP: endpoint JSON e contrato HTTP
Gilmar da Silva — 201269
Conceitos: Separe método HTTP, tipo de conteúdo, parsing e validação de domínio. Responda com status coerente.
Execute: php -S 127.0.0.1:8081 -t 20-aplicacao
Desafio: Teste GET, POST válido, JSON inválido, nome vazio e método DELETE; integre a um formulário via fetch.
*/

declare(strict_types=1);
header('Content-Type: application/json; charset=utf-8');
$metodo=$_SERVER['REQUEST_METHOD'];
if($metodo==='GET') {echo json_encode(['nome'=>'Gilmar da Silva','ra'=>201269]); exit;}
if($metodo!=='POST') {http_response_code(405);header('Allow: GET, POST');echo '{"erro":"Método não permitido"}';exit;}
if(strtolower(trim(explode(';',$_SERVER['CONTENT_TYPE'] ?? '')[0]))!=='application/json') {
    http_response_code(415);echo '{"erro":"Use application/json"}';exit;
}
try {
    $dados=json_decode(file_get_contents('php://input'),true,512,JSON_THROW_ON_ERROR);
    if(!is_array($dados) || !is_string($dados['nome'] ?? null) || trim($dados['nome'])==='') {
        http_response_code(422);echo '{"erro":"Nome obrigatório"}';exit;
    }
    // Validação e normalização apenas; este endpoint não persiste cadastro.
    echo json_encode(['nome'=>trim($dados['nome'])],JSON_THROW_ON_ERROR);
} catch(JsonException $e) {http_response_code(400);echo '{"erro":"JSON inválido"}';}
