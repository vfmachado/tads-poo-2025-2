package domain;

public class CorretorProva {
   
    public int corrigir(Prova prova, Gabarito gabarito) {
        int nota = 0;
        for (int i = 0; i < 10; i++) {
            if (gabarito.getRespostaQuestao(i).equals(prova.getRespostaQuestao(i))) {
                nota++;
            }
        }
        return nota;
    }

}
