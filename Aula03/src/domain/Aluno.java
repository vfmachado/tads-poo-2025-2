package domain;

// NAO PRECISO IMPORTAR AS COISAS DE DENTRO DE JAVA.LANG
import java.lang.Object;

public class Aluno {
    
    // ATRIBUTOS ESTATICOS é compartilhado entre os objetos da classe
    // ele pertence a classe como um todo
    private static int geradorDeInscricao = 0;
    private String nome;
    private String numInscrito;
    private String email;

    public Aluno(String nome) {
        geradorDeInscricao++;

        this.nome = nome;
        numInscrito = "2025" + String.format("%05d", geradorDeInscricao);
    }

    public void setEmail(String novo) {
        // valida o novo (regex)
        this.email = novo;
    }

    // SOBRESCREVER
    @Override
    public String toString() {
        return this.numInscrito + " - " + this.nome;
    }

}
