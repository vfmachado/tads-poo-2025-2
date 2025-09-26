package heranca2;

public class MainHeranca2 {
    public static void main(String[] args) {
        
        // NAO É PERMITIDO POIS A CLASSE É ABSTRATA
        // FormaGeometricaRegular quadrado = new FormaGeometricaRegular(4, 10);

        Quadrado q = new Quadrado(10);
        System.out.println(q.calcularArea());

        Triangulo t = new Triangulo(10);
        System.out.println(t.calcularArea());
    }
}
