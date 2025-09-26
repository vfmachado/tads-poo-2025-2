package agregacao;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private List<Aluno> alunos;

    Turma() {
        this.alunos = new ArrayList<Aluno>();
    }

    public void addAluno(Aluno a) {
        this.alunos.add(a);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}
