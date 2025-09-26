package heranca;

public class MainHeranca {
    public static void main(String[] args) {
        
        // ambas as classes tem comportamentos muito similares, compartilham varios atributos e métodos
        Aluno a = new Aluno();
        a.setCpf("12312312312");
        a.setNome("Aluno Fake");
        a.setMatricula("2025000001");
        a.setAnoIngresso(2025);

        Professor p = new Professor();
        p.setCpf("12312312313");
        p.setNome("Professor Fake");
        p.setMatricula("p20250001");
        p.setAnoIngresso(2025);

        // Pessoa p = new Pessoa();   pessoa nao é instanciavel pois a classe é abstrata

    }   
}
