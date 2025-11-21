package lsp;

// public class Quadrado extends Retangulo {
    
//     @Override
//     public void setLargura(double largura) {
//         super.setLargura(largura);
//         super.setAltura(largura);
//     }

// }

public class Quadrado implements Figura {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
