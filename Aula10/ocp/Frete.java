package ocp;

public class Frete {
    public float entregaExpressa() {
        System.out.println("Entrega expressa realizada.");
        return 100;
    }

    public float entregaNormal() {
        System.out.println("Entrega normal realizada.");
        return 50;
    }

    public float entregaEconomica() {
        System.out.println("Entrega econômica realizada.");
        return 20;
    }

    public float entregaMotoqueiro() {
        System.out.println("Entrega por motoboy realizada.");
        return 10;
    }
}
