package Aula06;

public class Robo implements IDirigir {
    
    public String nome;

    @Override
    public void dirigir() {
        System.out.println("ROBO CONTROLANDO");
    }
}
