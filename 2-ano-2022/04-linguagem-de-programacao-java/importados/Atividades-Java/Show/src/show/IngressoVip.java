/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: IngressoVip.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show;

/**
 *
 * @author Gilmar da Silva
 */
public class IngressoVip extends Ingresso {
    
    private int precoVip;
    private int qntIngressoVip;
    
    
    public int getQntIngressoVip() {
        return qntIngressoVip;
    }

    public void setQntIngressoVip(int qntIngressoVip) {
        this.qntIngressoVip = qntIngressoVip;
    }

    public int getPrecoVip() {
        return precoVip;
    }

    public void setPrecoVip(int precoVip) {
        this.precoVip = precoVip;
    }

    public void imprimeValor(){
        System.out.println("o valor do ingreço é :"+precoVip);
    }
    
    
}
