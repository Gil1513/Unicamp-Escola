<?php
/*
Identificação: Gilmar da Silva Filho
Matéria: Desenvolvimento de Aplicação Web II
Arquivo de estudo: Aula 2 - while.php
Explicação: PHP executa no servidor e produz a resposta; funções isolam trechos reutilizáveis.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
$n=1;
$tabuada=7;

while($n<=10){
    echo $n. "x" .$tabuada . " = " .($n * $tabuada) . "<br>";
    $n++;
}

$n = 11;
$tabuada = 7;

do{
    echo $n. "x" .$tabuada . " = " .($n * $tabuada) . "<br>";
    $n++;
}while($n<=10);

/*for
$tabuada2;
$n2;

for($n2; $n2<=10; $n2++){
    echo $n2. "x" .$tabuada2 . " = " .($n2 * $tabuada2) . "<br>";
}
*/
//foreach
$cores = array("Branco", "Verde", "Vermelho");

foreach($cores as $cor){
    echo $cor . "<br>";
}

$valores = array(55.00,10.99,20.00);
$total = 0;

foreach($valores as $valor){
    $total = $total + $valor;
}

//break
$tabuada3 = 7;
$n3 = 1;

do{
    echo $n3 . " x " . $tabuada3 . " = " . ($n3 * $tabuada3) . "br";
    if($n3 == 7) break;
    $n3++;
}while($n3<=10);

/*continue
$n4 = 1;
$tabuada4 = 7;

do{
    if($n4 == 4)continue;
    echo $n4 . " x " . $tabuada4 . " = " . ($n4 * $tabuada4) . "br";

}while($n4<=10);*/

//função
function calcMedia($n1, $n2){
    $media = ($n1+$n2)/2;
    return $media;
}


$media2 = calcMedia(7.0, 9.0);
echo "Media =" . $media2 ."<br>";

if($media2 >= 6.0){
    echo "<span id = 'aprovado'>Aprovado</span>";
}else{
    echo "<span id = 'reprovado'>Reprovada</span>";
}
?>

<html>
<title>Média</title>
    <style>
        #reprovado{
            background-color:red;
            color: white;
            font-weight:bold;
        }
        #reprovado{
            background-color:red;
            color: white;
            font-weight:bold;
        }
    </style>
</html>

<?php
function calcMedia2($n7, $n8){
    $media5 = ($n7+$n8)/2;
    return $media5;
}
function soma($v1, $v2, $v3){
    $soma = $v1 + $v2 + $v3;
    echo "Soma = " . $soma;
}
echo "<br>";
/*
//include("function.ph");
//require("function.php");

$media6 = calcMedia3(9.0, 10.0);
echo $media6;

echo $media6;

echo "<br><br>";
soma(1, 2, 3);
*/
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>testando menu require</title>
</head>
<body>
    <?php require("menu.html"/*outro arquivo*/);
    //require verifica e para execução se tiver erro
    //include ele continua executando independente de ter erro ou não
    ?>
</body>
</html>
