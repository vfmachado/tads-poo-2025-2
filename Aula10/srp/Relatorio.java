package srp;

public class Relatorio {
    
    public void gerarRelatorio(Pedido pedido) {
        System.out.println("Relatório do Pedido:");
        for (Item item : pedido.getItens()) {
            System.out.println(item);
        }
        System.out.println("Total: " + pedido.calcularTotal());
    }
}
