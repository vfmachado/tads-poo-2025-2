import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // debito, credito, pix, dinheiro, boleto
        Vendedor vendedor = new Vendedor("12312312312312");
        Cliente cliente = new Cliente("12312312312");

        Pedido pedido = new Pedido();
        Produto p1 = new Produto("Monitor 4k 28' 60HZ", "M001", 1499);
        Produto p2 = new Produto("Headset Wireless RGB 5.1", "HS002", 499);
        Produto p3 = new Produto("RTX 3060 TI 12GB", "RTX002", 1299);
        Produto p4 = new Produto("Memoria RAM 16GB", "RAM003", 249);

        pedido.adicionar(p3, 1);
        pedido.adicionar(p4, 4);

        System.out.println(pedido.total());

        IMeioPagamento meioPagamento = new PagamentoDinheiro();
        // como os metodos da classe sao estaticos, eu nao preciso instancia-la
        // Ecommerce ecommerce = new Ecommerce();
        System.out.println(Ecommerce.processar(cliente, vendedor, pedido, meioPagamento)); // true;

        Pedido pedido2 = new Pedido();
        pedido2.adicionar(p3, 10);
        System.out.println(Ecommerce.processar(cliente, vendedor, pedido2, meioPagamento));

        PagamentoPIX pix = new PagamentoPIX();
        System.out.println(Ecommerce.processar(cliente, vendedor, pedido2, pix)); // erro pq nao tem chave

        vendedor.setChavePix("meuemail@email.com");
        System.out.println(Ecommerce.processar(cliente, vendedor, pedido2, pix)); // sucesso

        // ecommerce.pagar(pedido, meiopagamento)
        // pedido.pagar(MeioPagamento)
        // meioPagamento.pagar(pedido);

    }
}
