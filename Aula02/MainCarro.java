public class MainCarro {
    public static void main(String[] args) {
        
        // Carro carro = new Carro();
        Carro carro = new Carro("TRACKER", 2020);
        // carro.ano = 2020; // o primeiro carro é de 1886 e nada maior que 2026
        // carro.modelo = "TRACKER";
        // carro.cor = "CINZA";
        
        // cliente solicitou que a tracker fosse cinza
        // Carro carro = new Carro("TRACKER", 2020, "CINZA");
        carro.pintar("CINZA");

        // deveria poder fazer isso aqui?
        // carro.ano = 2022;

        System.out.println(carro.informacoes());
        System.out.println(carro);

    
        Carro c = FabricaCarro.criarJeep();
        
    }
}
