package heranca2;

public class Quadrado extends FormaGeometricaRegular {
    
    public Quadrado(float comprimento) {
        super(4, comprimento);      // super é o construtor da classe pai (herdada)
    }

    // sobrescreve o metodo abstrato
    @Override
    float calcularArea() {
        return this.getComprimentolado() * this.getComprimentolado();
    }

    
}
