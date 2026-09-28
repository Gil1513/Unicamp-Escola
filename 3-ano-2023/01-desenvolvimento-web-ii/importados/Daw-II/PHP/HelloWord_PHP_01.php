<?php
/*
Identificação: Gilmar da Silva
Matéria: Desenvolvimento de Aplicação Web II
Arquivo de estudo: HelloWord_PHP_01.php
Explicação: PHP executa no servidor e produz a resposta.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
    echo "Meu primeiro código PHP! <b> Hello!</b>";
    echo "<br>";
    echo "Gilmar da Silva";

    echo "<br><br>";

//variáveis
$nome = "cotil";
echo $nome;
echo "<br><br>";

var_dump($nome); //exibe o tipo de dado, tamanho e valor
echo "<br><br>";

$outroNome = "Unicamp";

echo $nome . " " . $outroNome;
echo "<br><br>";


unset ($nome); //remove a variavel. Se quiser limpar várias, basta separar por ","

if(isset($nome)){
    echo $nome;
    echo $nome;
    echo "<br><br>";
}else{
    echo "a variável está vázia! <br><br>";
    echo "<br><br>";
}

$valor = 50.15;
echo $valor;
echo "<br><br>";

$aprovado = true;
echo $aprovado;
echo "<br><br>";

$disciplina = array("BD", "LP", "DAW");
echo $disciplina[2];
echo "<br><br>";


//constante
define("PI", 3.14);
define("NOME_ALUNO" , "Maria");

$resultado = 3 * PI;
echo $resultado . "<br><br>";
echo "NOme do Aluno" . NOME_ALUNO . "<br><br>";

//Super váriaveis

echo "<br><br>";

echo $_SERVER["SEVER_SDDR"] . "<BR>";
echo $_SERVER["SEVER_NAME"] . "<BR>";
echo $_SERVER["SEVER_USER"] . "<BR>";
echo $_SERVER["SEVER_NAME"] . "<BR>";
