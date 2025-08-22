public class Conta {
    
    private String titular;
    private float saldo;

    // ESTADO INICIAL DO MEU OBJETO QUANDO CRIADO (NEW)
    Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(float valor) {
        this.saldo = this.saldo + valor;
    }

    // como identificar que a operação foi bem sucedida?
    // DEPENDE DA IMPLEMENTAÇÃO / ABSTRAÇÃO QUE ESTAMOS CRIANDO
    public boolean sacar(float valor) {
        // System.out.println("SALDO ATUAL " + saldo);
        // System.out.println("SACANDO O VALOR DE " + valor);
        if (valor > this.saldo) {
            return false;       // early return
        }

        this.saldo = this.saldo - valor;
        return true;
    }

    public String verConta() {
        return "O TITULAR " + titular + " TEM SALDO " + saldo;
    }

    

}
