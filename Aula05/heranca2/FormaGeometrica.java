package heranca2;

// CLASSE ABSTRATA 
abstract class FormaGeometricaRegular {
    
    private int numLados;
    private float comprimentoLado;

    FormaGeometricaRegular(int lados, float comprimento) {
        this.numLados = lados;
        this.comprimentoLado = comprimento;
    }

    public float perimetro() {
        return this.numLados * this.comprimentoLado;
    }

    public int getNumLados() { return numLados; }
    public float getComprimentolado() { return comprimentoLado; }

    // METODO ABSTRATO - signfica que quem herdar esta classe é OBRIGADO a implementar este método
    abstract float calcularArea();

}
