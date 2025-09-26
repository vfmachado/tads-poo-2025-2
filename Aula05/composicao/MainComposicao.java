package composicao;

public class MainComposicao {
    public static void main(String[] args) {
        
        Casa casa = new Casa();
        casa.mostrarComodos();

        // NAO PERMITIMOS A CRIACAO DE UM COMODO (PARTE) FORA DO TODO (CASA)
        // Comodo comodo = new Comodo("Cozinha");

    }
}
