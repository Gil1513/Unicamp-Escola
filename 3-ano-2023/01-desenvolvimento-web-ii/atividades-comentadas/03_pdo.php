<?php
/*
CRUD, PDO e consultas preparadas
Autor: Gilmar da Silva
Matéria: Desenvolvimento de Aplicação Web II
Conceitos: PDO separa SQL dos valores recebidos. Placeholders representam valores, não nomes de tabelas. Uma transação confirma ou desfaz um conjunto de operações.
Objetivo: Criar, inserir, consultar, atualizar e excluir em um banco SQLite em memória.
Execução (nesta pasta): php 03_pdo.php (requer pdo_sqlite)
Pratique: Adapte a conexão para MySQL via variáveis de ambiente e mantenha os parâmetros preparados.
*/
$banco = new PDO('sqlite::memory:', null, null, [PDO::ATTR_ERRMODE=>PDO::ERRMODE_EXCEPTION]);
$banco->exec('CREATE TABLE material (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, quantidade INTEGER NOT NULL CHECK(quantidade>=0))');
try {
    $banco->beginTransaction();
    $inserir = $banco->prepare('INSERT INTO material (nome, quantidade) VALUES (:nome, :quantidade)');
    $inserir->execute(['nome'=>'Caderno', 'quantidade'=>3]);
    $id = $banco->lastInsertId();
    $atualizar = $banco->prepare('UPDATE material SET quantidade=:quantidade WHERE id=:id');
    $atualizar->execute(['quantidade'=>5,'id'=>$id]);
    $banco->commit();
} catch (Throwable $erro) {
    if ($banco->inTransaction()) $banco->rollBack();
    throw $erro;
}
$buscar = $banco->prepare('SELECT nome, quantidade FROM material WHERE id=?');
$buscar->execute([$id]);
echo json_encode($buscar->fetch(PDO::FETCH_ASSOC), JSON_UNESCAPED_UNICODE) . PHP_EOL;
$excluir = $banco->prepare('DELETE FROM material WHERE id=?');
$excluir->execute([$id]);
echo 'Restantes: ' . $banco->query('SELECT COUNT(*) FROM material')->fetchColumn() . PHP_EOL;
