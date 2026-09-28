<?php
/*
Identificação: Gilmar da Silva
Matéria: Desenvolvimento de Aplicação Web II
Arquivo de estudo: Aula2-Exemplo1(Media em if).php
Explicação: PHP executa no servidor e produz a resposta.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
$media = 4.5 ;
if($media >= 6.0){
    echo " Aprovado";
}
else if (($media >3.0) && ($media <6.0) )
    echo "Dependencia";

else{
    echo "Reprovado";
}