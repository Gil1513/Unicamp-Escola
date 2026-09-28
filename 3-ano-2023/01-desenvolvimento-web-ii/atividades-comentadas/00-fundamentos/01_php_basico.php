<?php
/*
Tipos, funções e arrays em PHP
Responsável: Gilmar da Silva
Conceitos: Arrays podem ter chaves nomeadas. Comparação estrita evita conversões inesperadas; funções devem validar o domínio.
Execução: php 00-fundamentos/01_php_basico.php
Pratique: Adicione uma função que selecione alunos com média maior ou igual a seis.
*/
declare(strict_types=1);
function media(array $notas): float {
    if (count($notas) === 0) throw new InvalidArgumentException('Sem notas');
    foreach ($notas as $nota) {
        if (!is_numeric($nota) || $nota < 0 || $nota > 10) throw new InvalidArgumentException('Nota inválida');
    }
    return array_sum($notas) / count($notas);
}
$aluno = ['ra' => 201269, 'nome' => 'Gilmar da Silva', 'notas' => [6, 8, 10]];
if (media($aluno['notas']) !== 8.0) throw new RuntimeException('Média incorreta');
try { media([]); throw new RuntimeException('Lista vazia aceita'); }
catch (InvalidArgumentException $e) { echo $e->getMessage(), PHP_EOL; }
echo $aluno['nome'], ': ', media($aluno['notas']), PHP_EOL;
