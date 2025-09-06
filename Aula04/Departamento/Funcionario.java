package Departamento;

public class Funcionario {
    
    private String nome;
    private Departamento departamento;

    public Funcionario(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
        
        departamento.addFuncionario(this);
    }

    public String getName() {
        return this.nome;
    }

    // SOBRESCREVE O TOSTRING DA CLASSE OBJECT
    @Override
    public String toString() {
        // Vinicius # TI - Recrutamento
        return this.nome + " # "+ this.departamento.getName();
    }

    public void alterarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


}
