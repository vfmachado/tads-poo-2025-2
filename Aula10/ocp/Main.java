package ocp;

public class Main {
    public static void main(String[] args) {
        
        // interface            // implementacao
        Entrega entrega = new NormalEntrega();
        entrega = new ExpressaEntrega();

        // antes
        String escolheu = "expressa";
        Frete frete = new Frete();
        if ( escolheu.equals("normal") ) {
            frete.entregaNormal();
        } else if ( escolheu.equals("expressa") ) {
            frete.entregaExpressa();
        }
    }
}
