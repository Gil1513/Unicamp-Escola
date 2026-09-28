<?php
/*
Identificação: Gilmar da Silva
Matéria: Desenvolvimento de Aplicação Web II
Arquivo de estudo: Aula 3 - Funcoes.php
Explicação: PHP executa no servidor e produz a resposta; funções isolam trechos reutilizáveis.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
//FUNÇÕES
function calMedia($n1, $n2){
    $media =($n1+ $n2)/2;
    return $media;
}

function soma ($v1, $v2, $v3){
    $soma = $v1 + $v2 + $v3;
    echo "Soma=" . $soma;
}

?>