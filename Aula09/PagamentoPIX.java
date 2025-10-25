public class PagamentoPIX implements IMeioPagamento {

    
    @Override
    public void pagar(Cliente cliente, Vendedor vendedor, float valor) throws Exception {
        if (vendedor.getChavePix() == null) throw new Exception("CHAVE PIX NAO CADASTRADA - METODO DE PAGAMENTO NAO ACEITO");

        System.out.println("Recebendo do cliente " + cliente.getCpf() + " o valor " + valor + " para o vendedor na chave pix " + vendedor.getChavePix() );
    }

}
