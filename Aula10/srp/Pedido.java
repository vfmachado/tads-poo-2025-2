package srp;

import java.util.ArrayList;
import java.util.List;

// pedido de ecommerce
public class Pedido {
    
    // atributos
    List<Item> itens;

    Pedido() {
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }
    
    // metodos
    public float calcularTotal() {
        float total = 0;
        for (Item item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }

    // FOI PARA A CLASSE RELATORIO
    // public void gerarRelatorio() {
    //     System.out.println("Relatório do Pedido:");
    //     for (Item item : itens) {
    //         System.out.println(item);
    //     }
    //     System.out.println("Total: " + calcularTotal());
    // }

    // foi para a classe PedidoDB
    // public void salvarBanco() {
    //     // Simula salvar o pedido em um banco de dados
    //     System.out.println("Pedido salvo no banco de dados.");
    // }

    public List<Item> getItens() {
        return itens;
    }

}
