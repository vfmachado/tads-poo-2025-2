package Departamento;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    
    private String nome;
    private Funcionario chefe;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getName() {
        return this.nome;
    }

    public void setChefe(Funcionario fun) {
        this.chefe = fun;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    @Override
    public String toString() {
        return this.nome + " RESPONSAVEL: " + this.chefe.getName() + "\nFuncionarios " + this.funcionarios;
    }
}
