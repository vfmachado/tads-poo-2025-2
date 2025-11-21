package ocp;

public class ExpressaEntrega implements Entrega {
    @Override
    public float calcularCusto() {
        System.out.println("Entrega expressa realizada.");
        return 100;
    }
    
}
