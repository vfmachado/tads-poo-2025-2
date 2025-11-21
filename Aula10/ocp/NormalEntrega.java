package ocp;

public class NormalEntrega implements Entrega {
    @Override
    public float calcularCusto() {
        System.out.println("Entrega normal realizada.");
        return 50;
    }
    
}
