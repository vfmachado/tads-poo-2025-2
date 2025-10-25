// significa que faz algo / padroniza algum(ns) metodods
public interface IMeioPagamento {
    abstract void pagar(Cliente comprador, Vendedor loja, float valor) throws Exception;   
    // abstract RetornoProcessoPagamento pagar(float valor) throws Exception;   
}
