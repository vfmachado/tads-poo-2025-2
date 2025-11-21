package srp;

public class Item {
    
    // private String nome;
    // private float preco;
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    // public Item(String nome, float preco, int quantidade) {
    //     this.nome = nome;
    //     this.preco = preco;
    //     this.quantidade = quantidade;
    // }

    // public String getNome() {
    //     return nome;
    // }

    // public float getPreco() {
    //     return preco;
    // }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + produto.getNome() + '\'' +
                ", preco=" + produto.getPreco() +
                ", quantidade=" + quantidade +
                '}';
    }
}
