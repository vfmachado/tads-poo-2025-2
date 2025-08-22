
public class Main {
    public static void main(String[] args) {
        
        // declaracao de uma variavel do tipo da minha classe
        // no nosso caso Borracha
        Borracha b1;
        
        // List<Borracha> borrachas = new ArrayList<Borracha>();

        b1 = new Borracha();
        b1.cor = "VERDE";
        b1.marca = "MERCUR";
        // b1.tamahoEmCm3 = 24; => PROIBIDO POIS O ATRIBUTO É PRIVADO
        b1.resistencia = 2;

        b1.apagar("QUERO APAGAR ESTE TEXTO PARA VER COM QUE TAMANHO A BORRACHA VAI FICAR");

        System.out.println(b1.verificarTamanho());


    }
}
