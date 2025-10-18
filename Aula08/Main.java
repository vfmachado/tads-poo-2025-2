package Aula08;

import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        // main pode ser declarativo 
        // Pessoa = new Pessoa("Nome da pessoa) nao quero fazer
        Paciente p1 = new Paciente("Vinicius", "14/06/1991","99999999999", "+5551997999999");
        Medico m1 = new Medico("M1", "CRM_123123", ["CLINICO GERAL", ""]);
        Tecnico t1 = new Tecnico("Nome tecnico", "COD_12213123", ["RADIOGRAFIA", "ANALISES CLINICAS"]);

        // List<Integer>

        Consulta c1 = new Consulta(m1, p1);
        c1.finalizar("laudo da consulta c1");
/* 
            pessoa
           /       \ 
          /         \
         /           \
   paciente        profissional
                    /       \
                   /         \
                 medico     tecnico
                    ^          ^
                    |          |
                    IAvaliarExame

*/
        Exame e1 = new Exame(p1);
        //ex1.avaliar(m1, "laudo e1");    // pode ser o medico
        m1.avalair(ex1, "laudo medico");

        Exame e2 = new Exame(p1);
        // ex2.avaliar(t1, "laudo e2");
        t1.avaliar(e2, "laudo tecnico");

        // sysout(p1.getHistorico()) // Paciente fez consulta com o medico(a) M1 com laudo "laudo da consulta c1"
        // exames feitos
        // e1, e2

        // ou com switch case - fica mais legal :) 
    }

}
