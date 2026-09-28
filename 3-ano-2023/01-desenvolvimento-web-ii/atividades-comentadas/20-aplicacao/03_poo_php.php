<?php
/*
PHP: classes, interfaces e exceções
Gilmar da Silva — 201269
Conceitos: Uma interface define o contrato; propriedades privadas protegem o estado. A implementação pode ser substituída.
Execute: php 20-aplicacao/03_poo_php.php
Desafio: Crie RepositorioPDO com o mesmo contrato, usando comandos parametrizados.
*/

declare(strict_types=1);
interface Repositorio { public function salvar(string $nome): void; public function listar(): array; }
final class Memoria implements Repositorio {
    private array $itens=[];
    public function salvar(string $nome): void {
        $nome=trim($nome);
        if ($nome==='') throw new InvalidArgumentException('Nome vazio');
        $this->itens[]=$nome;
    }
    public function listar(): array {return $this->itens;}
}
$repo=new Memoria(); $repo->salvar(' Java ');
if($repo->listar()!==['Java']) throw new RuntimeException('Resultado incorreto');
try {$repo->salvar(' '); throw new RuntimeException('Vazio aceito');}
catch(InvalidArgumentException $e) {echo $e->getMessage(),PHP_EOL;}
echo json_encode($repo->listar(),JSON_THROW_ON_ERROR),PHP_EOL;
