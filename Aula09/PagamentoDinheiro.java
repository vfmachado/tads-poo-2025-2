public class PagamentoDinheiro implements IMeioPagamento {

    @Override
    public void pagar(Cliente c, Vendedor v, float valor) throws Exception {
        if (valor >= 5000) {
            throw new Exception("Valor alto demais para ser aceito em dinheiro");
        }
        System.out.println("PAGOU COM DINHEIRO");
        
    }
    
}
