// import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String titular;
        // float saldo;

        // titular = "Vinicius";
        // saldo = 0;

        // // deposito
        // float valor = 100;
        // saldo = saldo + valor;

        // // saque
        // valor = 300;
        // saldo = saldo - valor;

        // titular = "alterei e nao podia";
        // saldo = 999999999;

        // System.out.println("O TITULAR " + titular + " TEM SALDO " + saldo);

        Conta c1 = new Conta("VINICIUS");
        // c1.titular = "nao pode";   e está certo!
        c1.depositar(200);
        // c1.saldo = 200; nao é possivel e está certo também !
        System.out.println(c1.verConta());

        c1.sacar(50);   
        System.out.println(c1.verConta()); // 150

        boolean sucesso  = c1.sacar(200);      // essa ação não deve ser permitida
        if (sucesso) {
            System.out.println("SAQUE BEM SUCEDIDO");
        } else {
            System.out.println("NAO FOI POSSIVEL REALIZAR O SAQUE");
        }
        System.out.println(c1.verConta()); // 150
    }
}
