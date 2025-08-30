package domain;

public class Prova {
    
    private Aluno aluno;
    private String[] respostas;

    public Prova(Aluno aluno) {
        this.aluno = aluno;
    }

    public void responder(String respostas) {
        this.respostas = respostas.split("");
    }

    public String getRespostaQuestao(int numero) {
        // if numero >= 0 && numero < respostas.length
        return this.respostas[numero];
    }

    public Aluno getAluno() {
        return this.aluno;
    }
}
