
<?php
/*
Identificação: Gilmar da Silva
Matéria: Desenvolvimento de Aplicação Web II
Arquivo de estudo: Aula 4 - funçãoFomr-Php.php
Explicação: PHP executa no servidor e produz a resposta; parâmetros HTTP transportam os dados do formulário; funções isolam trechos reutilizáveis.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
    if($_SERVER["REQUEST_METHOD"] == 'POST'){
        $msgMedia = " ";
        $msgResultado = " ";

        function calcMedia($n1, $n2){
            $media = ($n1+$n2)/2;
            return $media;
        }
        //calculaMedia.php?note1=8.0&nota2=7.0
        $n1 = $_POST["nota1"];
        $n2 = $_POST["nota2"];
    
        if (trim ($n1) == ""){
            //echo "<span id = 'warning'>Informe as duas notas!</span>";
            $msgN1 = "A nota 1 é obrigatória";
        }
        else if (trim ($n2)== ""){
            $msgN2 = "A nota 2 é obrigatória";
        }
        }else{
            $msgN1 = " ";
            $msgN2 = " ";

            $media = calcMedia($n1 , $n2);
            echo "média = " . $media . "<br>";
        
       /* if((!isset($n1)) || (!isset($n2)) ){
            echo "<span id = 'warning'>Informe as duas notas!</span>"
        }else{
        $media calcuMedia($n1 , $n2);
    
        echo "média = " . $média ."<br>";
        }*/
    
        if($media >= 6.0){
            $msgResultado = "<span id='aprovado'>APROVADO</span>";
        }else{
            $msgResultado = "<span id='reprovado'>reprovado</span>";
        }
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>calulo média</title>
</head>
<body>
<h1>Cálculo de média</h1>

    <form method="post">
        <!--action="funcao-url.php"-->

        Nota 1: <br>
        <input type="text" name="nota1"><br>
        <span id = "warning"><small><? = $msgN1; ?></small></span>

        <br><br>

        Nota 2: <br>
        <input type="text" name="nota2"><br>
        <span id = "warning"><small><? = $msgN2; ?></small></span>

        <br><br>

        <input type="submit" value ="Calcular">

    </form>
    <hr>
    <?= $msgMedia ?>
    <br>
    <? = $msgResultado?>
</body>
</html>

