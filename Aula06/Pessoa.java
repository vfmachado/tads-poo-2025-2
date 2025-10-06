package Aula06;

public class Pessoa implements IDirigir {

    public String nome;

    @Override
    public void dirigir() {
        System.out.println("PESSOA DIRIGINDO");
    }
}
