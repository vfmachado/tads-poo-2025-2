public class Borracha {
    // CUIDADO COM SUPER MODELOS
    // atributos - caracteristica
    private float tamanhoEmCm3 = 24;
    int resistencia;
    String marca;
    String cor;

    // AÇÕES DA CLASSE E ACESSOS AOS DADOS
    // métodos
    public void apagar(String texto) {
        int textLength = texto.length();
        tamanhoEmCm3 = tamanhoEmCm3 - textLength * 0.01f / resistencia;
    }
    
    public float verificarTamanho() {
        return tamanhoEmCm3;
    }

}
