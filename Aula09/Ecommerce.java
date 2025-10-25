public class Ecommerce {
    
    public static boolean processar(Cliente cliente, Vendedor vendedor, Pedido pedido, IMeioPagamento meioPagamento) {
        System.out.println("\nPROCESSANDO PAGAMENTO DO PEDIDO DE VALOR " + pedido.total());
        try {
            meioPagamento.pagar(cliente, vendedor, pedido.total());
            return true;
        } catch (Exception e) {
            System.out.println("PAGAMENTO RECUSADO " + e.getMessage());
            return false;
        }
    }

}
