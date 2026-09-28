/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: TesteHibernate2.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;
import org.hibernate.query.Query;


/**
 *
 * @author Gilmar da Silva
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Aluno al1 = new Aluno(1234, "Maria");
        Aluno al2 = new Aluno(4567,"Jose");
        session.save(al1);
        session.save(al2);
        
        Professor p1 = new Professor("Juninho",5555,"juninho.mirim@gmail.com",2000);
        Professor p2 = new Professor("Bill",1111,"borabill@gmail.com",2222);
        session.save(p1);
        session.save(p2);
        
        Disciplina d1 =  new Disciplina("Biologia",2,3);
        Disciplina d2 =  new Disciplina("Historia",4,5);
        Disciplina d3 =  new Disciplina("Geografia",6,7);
        session.save(d1);
        session.save(d2);
        session.save(d3);
        
                
        session.getTransaction().commit();
       
        String hql = "from Aluno where nome like 'j%'";
        Query query = session.createQuery(hql);
        List<Aluno> listaAl = query.list();
        for (Aluno a: listaAl){
            System.out.println("Nome:"+a.getNome());
            System.out.println("RA::"+a.getRa());
            System.out.println("=====================");
        }
        
        session.close();
        HibernateUtil.shutdown();        
        
        
        
    }
}
