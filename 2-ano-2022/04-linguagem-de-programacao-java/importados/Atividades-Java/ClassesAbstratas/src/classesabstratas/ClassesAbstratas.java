/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: ClassesAbstratas.java
Explicação: classes agrupam dados e comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/

package classesabstratas;

public class ClassesAbstratas {

    
    public static void main(String[] args) {
        //Animal a = new Animal();
        
        Animal a = new Cachorro();
        a.falar();
        
        Animal g = new Gato();
        g.falar();
        
        Gato g1 = (Gato) g;
        g1.arranha();
        
        Animal a2 = new Vaca();
        a2.falar();
    }
    
}
