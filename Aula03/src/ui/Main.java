package ui;

import java.util.Arrays;
import java.util.List;

import domain.Aluno;
import domain.CorretorProva;
import domain.Gabarito;
import domain.Prova;

/*
 DESENVOLVA UM SISTEMA QUE DADO UMA LISTA DE ALUNOS E SUAS PROVAS,
 UM GABARITO E A NOTA MINIMA & QUANTIDADE MAX DE APROVADOS, RETORNE A LISTA COM NUM_INSCRICAO E NOME ORDENADOS POR NOTA.
 
 - A PROVA CONSISTE EM N QUESTOES DE MARCAR COM MULTIPLAS ALTERNATIVAS (A ATÉ E)
 - A NOTA MINIMA E QUANT DE APROVADOS DEVE SER INPUTADO / DEFINIDO EM TEMPO DE EXECUÇÃO

 */
public class Main {
    public static void main(String[] args) {
        
        // String [] gabarito = {"A", "A", "A", "D", "E", "C", "B", "B", "C", "E"};
        // String [] prova1 =   {"A", "B", "C", "A", "C", "C", "B", "B", "C", "E"};
        // String [] prova2 =   {"B", "A", "C", "A", "E", "E", "B", "B", "C", "D"};

        // PODERIA SER UMA MATRIZ [ALUNOS][RESPOSTAS]
        // PROBLEMAS?
        // FALTA DE CONFIABILIDADE, SEGURANÇA NO ACESSO E ALTERAÇÃO DE INFORMACOES
        // SE TUDO É PUBLICO, QLQR CLASSE E EM QUALQUER LUGAR PODEMOS MODIFICAR


        // // qual foi a nota da p1 e da p2?
        // int n1 = 0;
        // for (int i = 0; i < prova1.length; i++) {
        //     if (gabarito[i] == prova1[i]) {
        //         n1++;
        //     }
        // }

        // System.out.println("NOTA 1: " + n1);

        // criando uma instancia da classe gabarito
        // objeto =)
        //1
        // Gabarito gabarito = new Gabarito();
        //2
        Gabarito gabarito = new Gabarito("AABCDEBCDE");
        System.out.println(gabarito.getRespostaQuestao(0));

        Aluno a1 = new Aluno("Francine Moraes");
        Aluno a2 = new Aluno("Jorge Alves");
        System.out.println(a1);
        System.out.println(a2);

        Prova p1 = new Prova(a1);
        p1.responder("AABCDECCDE"); // 9

        Prova p2 = new Prova(a2);
        p2.responder("DABCDECCDE"); // 8

        Prova p3 = new Prova(new Aluno("Roberto Silva"));
        p3.responder("AABCDECCDC");

        CorretorProva corretor = new CorretorProva();   // construtor padrao
        
        List<Prova> provas = Arrays.asList(p1, p2, p3);
        for (Prova prova : provas) {
            int nota = corretor.corrigir(prova, gabarito);
            System.out.println(prova.getAluno() + "  NOTA: " + nota);
        }
        
    }
}
