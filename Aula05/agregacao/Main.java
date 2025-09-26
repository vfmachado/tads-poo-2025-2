package agregacao;
public class Main {
    public static void main(String[] args) {
       
        Aluno a1 = new Aluno("roberto");
        Aluno a2 = new Aluno("mathias");
        Aluno a3 = new Aluno("francine");

        Turma turma = new Turma();
        turma.addAluno(a1);
        turma.addAluno(a2);
        turma.addAluno(a3);

        turma.listarAlunos();
       
    }
}
