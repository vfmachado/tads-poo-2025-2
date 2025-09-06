package Aula04.Colorir;

// classe
// MODELO / FORMA
// classe publica - OUTROS ARQUIVOS EM DIFERENTES PACOTES PODEM UTILIZAR ESSA CLASSE
public class Cor {
    
    // ATRIBUTOS - caracteristicas
    // nao quero permitir que outras classes/arquivos acessem diretamente
    // POO - Principio do encapsulamento
    private int r;
    private int g;
    private int b;

    // construtor - como meu objeto é inicializado
    public Cor() {
        System.out.println("CONSTRUTOR PADRAO!");
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }

    public Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Cor(String cor) {
        this();    // chama o construtor padrao da classe
        if (cor.equals("blue")) {
            this.b = 255;
        }
        // poderia fazer para varias cores
    }

    // METODOS - ações que executamos com o objeto
    /**
     * Método para setar o valor do componente RED da classe COR
     * 
     * @param r  valor inteiro entre [0,255], caso seja passado um valor fora dos limites, ele é automaticamente travado no limite próximo
     */
    public void setR(int r) {
        if (r < 0) {
            r = 0;
        }

        if (r > 255) {
            r = 255;
        }

        // sem this e com this
        // sem this -> é o parametro do método
        // com this -> é o atributo da minha classe
        this.r = r;
    }

    public int getR() {
        return this.r;
    }
}
