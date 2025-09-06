package Aula04.Colorir;


public class App {
    public static void main(String[] args) {
        System.out.println("FUNCIONA");

        // class x object
        // classe é o modelo
        // objeto é a instancia daquele modelo
        Cor c1 = new Cor();
        Cor c2 = new Cor("blue");

        c1.setR(300);
        System.out.println(c1.getR() == 255);
        // nao funciona por conta da visibilidade da classe
        // Aluno a  = new Aluno();
        
    }
}