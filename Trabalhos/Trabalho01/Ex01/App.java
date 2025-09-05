public class App {
  public static void main(String[] args) {

    System.out.println("Olá mundo!");

    MaquinaAgua maq = new MaquinaAgua();
    // System.out.println(maq.agua() == 0); // mL
    // System.out.println(maq.copos200() == 0);
    // System.out.println(maq.copos300() == 0);

    // maq.servirCopo200(); // não efetua, pois não há copo nem água

    // System.out.println(maq.agua() == 0); // mL
    // System.out.println(maq.copos200() == 0); // unidades
    // System.out.println(maq.copos300() == 0); // unidades

    // maq.abastecerAgua(); // inicializa 20000mL
    // System.out.println(maq.agua() == 20000); // mL

    // maq.abastecerAgua(); // mantém consistente
    // System.out.println(maq.agua() == 20000); // mL

    // maq.servirCopo200(); // não efetua, sem copo
    // System.out.println(maq.agua() == 20000); // mL

    // System.out.println(maq.copos200() == 0);
    // maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200
    // System.out.println(maq.copos200() == 100);

    // maq.servirCopo200(); // -200
    // maq.servirCopo200(); // -200
    // maq.servirCopo200(); // -200
    // maq.servirCopo200(); // -200
    // maq.servirCopo200(); // -200, isto é, -1000ml e 5 copos de 200

    // System.out.println(maq.agua() == 19000);
    // System.out.println(maq.copos300() == 0);
    // System.out.println(maq.copos200() == 95);
    // maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200 novamente
    // System.out.println(maq.copos200() == 100);

    // maq.servirCopo200(); // -200ml e 1 copo de 200
    // System.out.println(maq.agua() == 18800);
    // System.out.println(maq.copos200() == 99);

    // System.out.println(maq.copos300() == 0);
    // maq.servirCopo300(); // não efetua, não há copo 300
    // maq.abastecerCopo300(); // agora a máquina possui 100 copos de 300
    // System.out.println(maq.copos300() == 100);
    // maq.servirCopo300(); // agora efetua
    // System.out.println(maq.agua() == 18500);
    // System.out.println(maq.copos200() == 99);
    // System.out.println(maq.copos300() == 99);

    // // servir 50 copos de 300 = -15000ml
    // for (int i = 0; i < 50; i++)
    //   maq.servirCopo300();

    // System.out.println(maq.agua() == 3500);
    // System.out.println(maq.copos200() == 99);
    // System.out.println(maq.copos300() == 49);

    // // servir 17 copos de 200 = 3400ml
    // for (int i = 0; i < 17; i++)
    //   maq.servirCopo200();

    // System.out.println(maq.agua() == 100);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 49);

    // // não há água para atender o pedido
    // maq.servirCopo300();
    // System.out.println(maq.agua() == 100);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 49);

    // // não há água para atender o pedido
    // maq.servirCopo200();
    // System.out.println(maq.agua() == 100);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 49);

    // maq.abastecerAgua(); // inicializa 20000mL
    // System.out.println(maq.agua() == 20000);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 49);

    // // servir os 49 copos de 300 restantes = 14700ml
    // while (maq.copos300() > 0)
    //   maq.servirCopo300();

    // System.out.println(maq.agua() == 5300);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 0);

    // // não há copo para atender o pedido
    // maq.servirCopo300();
    // System.out.println(maq.agua() == 5300);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 0);

    // maq.servirCopo200(); // de 200 ok
    // maq.servirCopo200(); // de 200 ok

    // System.out.println(maq.agua() == 4900);
    // System.out.println(maq.copos200() == 80);
    // System.out.println(maq.copos300() == 0);

    // maq.abastecerCopo300(); // 100 copos de 300
    // System.out.println(maq.agua() == 4900);
    // System.out.println(maq.copos200() == 80);
    // System.out.println(maq.copos300() == 100);

    // // servir 3 copos de 300
    // maq.servirCopo300();
    // maq.servirCopo300();
    // maq.servirCopo300();

    // System.out.println(maq.agua() == 4000);
    // System.out.println(maq.copos200() == 80);
    // System.out.println(maq.copos300() == 97);
  }
}