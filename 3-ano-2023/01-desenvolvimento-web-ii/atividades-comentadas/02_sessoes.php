<?php
/*
Sessões e autenticação demonstrativa
Autor: Gilmar da Silva Filho
Matéria: Desenvolvimento de Aplicação Web II
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: HTTP não mantém estado por si só. Uma sessão associa requisições a um identificador; regenerar o ID após login evita reutilizar o identificador anterior. Token CSRF protege formulários.
Objetivo: Entrar usando usuário gilmar e senha estudo-local, sair por POST e rejeitar token inválido.
Execução (nesta pasta): php -S 127.0.0.1:8000; abra /02_sessoes.php
Pratique: Substitua a conta de demonstração por consulta preparada a uma tabela com hashes de senha.
*/
session_set_cookie_params(['httponly'=>true, 'samesite'=>'Lax']);
session_start();
$_SESSION['csrf'] ??= bin2hex(random_bytes(24));
$erro = '';
if (($_SERVER['REQUEST_METHOD'] ?? 'GET') === 'POST') {
    $token = $_POST['csrf'] ?? '';
    if (!is_string($token) || !hash_equals($_SESSION['csrf'], $token)) {
        http_response_code(403); exit('Token inválido.');
    }
    if (($_POST['acao'] ?? '') === 'sair') {
        $_SESSION = []; session_destroy(); header('Location: 02_sessoes.php'); exit;
    }
    $usuario = $_POST['usuario'] ?? '';
    $senha = $_POST['senha'] ?? '';
    // Credenciais públicas de laboratório local; não representam uma conta real.
    $hash = password_hash('estudo-local', PASSWORD_DEFAULT);
    if (is_string($usuario) && is_string($senha) && $usuario === 'gilmar' && password_verify($senha, $hash)) {
        session_regenerate_id(true);
        $_SESSION['usuario'] = 'Gilmar da Silva Filho';
        $_SESSION['csrf'] = bin2hex(random_bytes(24));
    } else { http_response_code(401); $erro = 'Credenciais inválidas.'; }
}
?>
<!doctype html><html lang="pt-BR"><meta charset="utf-8"><title>Sessões</title>
<h1>Sessões em PHP</h1>
<p>Laboratório local: gilmar / estudo-local</p>
<p><?= htmlspecialchars($_SESSION['usuario'] ?? $erro, ENT_QUOTES, 'UTF-8') ?></p>
<form method="post">
<input type="hidden" name="csrf" value="<?= htmlspecialchars($_SESSION['csrf'], ENT_QUOTES, 'UTF-8') ?>">
<?php if (isset($_SESSION['usuario'])): ?>
<button name="acao" value="sair">Sair</button>
<?php else: ?>
<label>Usuário <input name="usuario" autocomplete="username" required></label>
<label>Senha <input name="senha" type="password" autocomplete="current-password" required></label>
<button>Entrar</button>
<?php endif; ?></form></html>
