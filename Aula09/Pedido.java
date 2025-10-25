import java.util.HashMap;
import java.util.Map;

public class Pedido {
    
    // produto quantidade
    private Map<Produto, Integer> carrinho;

    Pedido() {
        carrinho = new HashMap<Produto,Integer>();
    }

    public void adicionar(Produto produto, int quantidade) {
        // todo ESTAMOS SOBRECRESVENDO NO CASO DA ADICAO DO MESMO PRODUTO
        carrinho.put(produto, quantidade);
    }

    public float total() {
        float total = 0;

        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {
            total = total + entry.getKey().getValor() * entry.getValue();
        }
        return total;
        
    }

}
