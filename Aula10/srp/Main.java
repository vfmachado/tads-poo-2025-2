package srp;


public class Main {
    public static void main(String[] args) {
        
        
        // Item i1 = new Item("Caneta", 2.5f, 10);
        // Item i2 = new Item("Caderno", 15.0f, 2);
        Produto p1 = new Produto("Caneta", 2.5f);
        Produto p2 = new Produto("Caderno", 15.0f);
        
        Pedido pedido = new Pedido();
        pedido.addItem(new Item(p1, 10));

        
        System.out.println("VALOR TOTAL " + pedido.calcularTotal());
        // pedido.gerarRelatorio();
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio(pedido);

        /*
            PONTOS POSITIVOS DO NOSSO CODIGO
            + FACIL
            + SIMPLES
            + RELATIVAMENTE ORGANIZADO
            + RESPEITO POO MMMMAAAAASSSSSSS O BASICO DE POO


        
        */
    }
}