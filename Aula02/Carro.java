public class Carro {

    // ATRIBUTOS
    
    // modifificador de acesso  (private)
    private String modelo;
    private int ano;
    private String cor;


    // METODO CONSTRUTOR - MESMO NOME DA CLASSE
    // ESTE É O CONSTRUTOR PADRÃO
    Carro() {
        // vazio por enquanto
    }

    // SEGUNDO CONSTRUTOR, COM PARAMETROS
    Carro(String modelo, int ano) {
        // é uma boa prática sempre que nos referirmos a um atributo/método da própria classe, utilizarmos o this
        this.modelo = modelo;
        this.ano = ano;
        this.cor = "BRANCO"; // VALOR DEFAULT
    }

    // TERCEIRO CONSTRUTOR TODOS OS PARAMETROS
    Carro(String m, int a, String c) {
        modelo = m;
        ano = a;
        cor = c;
    }

    public void pintar(String cor) {
       this.cor = cor;
    }

    // MÉTODOS
    public String informacoes() {
        return "Carro " + modelo + " da cor " + cor + " ano " + ano;
    }
}