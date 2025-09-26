package heranca2;

public class Triangulo extends FormaGeometricaRegular {
    
    public Triangulo(float comprimento) {
        super(3, comprimento);      // super é o construtor da classe pai (herdada)
    }

    // sobrescreve o metodo abstrato
    @Override
    float calcularArea() {
        return (float) (this.getComprimentolado() * this.getComprimentolado() * Math.sqrt(3) / 4);
    }

    
}
