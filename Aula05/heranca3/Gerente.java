package heranca3;

public class Gerente extends Funcionario {
 
    private String setor;

    Gerente(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "GERENTE  " + this.getNome() + " DO SETOR " + setor + " COM SALARIO " + this.getSalario();
    }
    
}
