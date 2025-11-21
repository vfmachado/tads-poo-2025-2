package lsp;

public class Main {
    
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(10);
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());

        Retangulo quadrado = new Quadrado();
        // esse metodo foi sobrescrito / extendido e o comportamento da classe pai foi modificado e agora eu nao sei mais como isso funciona
        quadrado.setLargura(5);
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());

        // esse metodo nao foi sobrescrito / extendido
        // entao o comportamento esperado é o da classe Retangulo
        quadrado.setAltura(10);
        System.out.println("Área do Quadrado após alterar altura: " + quadrado.calcularArea());

        // posso fazer pq quadrado extends retangulo, logo é um
        // Retangulo q2 = new Quadrado(); NAO PODE MAIS PQ A CLASSE BASE MUDOU PARA FIGURA

        Figura f1 = new Retangulo();
        ((Retangulo)f1).setLargura(4);
        ((Retangulo)f1).setAltura(8);

        Figura f2 = new Quadrado();
        ((Quadrado)f2).setLado(6);
    }

}
