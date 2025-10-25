
// classe imutavel
public class Produto {

    private final String nome;
    private final String codigo;
    private final float valor;

    public Produto(String nome, String codigo, float valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }
}