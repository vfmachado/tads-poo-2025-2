class App {
  public static void main(String[] args) {

    System.out.println("Olá mundo!");

    // Forno f = new Forno(45, 220, 1700, 66, 40, 54);
    // System.out.println(f.volume == 45);
    // System.out.println(f.tensao == 220);
    // System.out.println(f.potencia == 1700);
    // System.out.println(f.largura == 66);
    // System.out.println(f.altura == 40);
    // System.out.println(f.profundidade == 54);
    // // todos esses atributos devem ser constantes, as atribuções a seguir não podem compilar,
    // // verifique se estão protegidas e então comente estas linhas:
    // f.volume = 450;
    // f.tensao = 2200;
    // f.potencia = 17000;
    // f.altura = 400;
    // f.largura = 660;
    // f.profundidade = 540;

    // // Novo Forno
    // Forno forno = new Forno(84, 220, 1860, 61, 58, 58);
    // System.out.println(forno.volume == 84);
    // System.out.println(forno.tensao == 220);
    // System.out.println(forno.potencia == 1860);
    // System.out.println(forno.altura == 58);
    // System.out.println(forno.largura == 61);
    // System.out.println(forno.profundidade == 58);

    // // métodos para consulta
    // System.out.println(forno.temperatura()); // 0 (de 50 a 300)
    // System.out.println(forno.ligado()); // false
    // // os atributos temperatura e ligado devem ser inacessíveis (privados)
    // // não deve compilar, verifique e depois comente as seguintes linhas
    // System.out.println(forno.temperatura);
    // System.out.println(forno.ligado);

    // // interagindo com o forno (submetendo comandos ao objeto)
    // System.out.println(forno.ligado() == false);
    // forno.aumentarTemperatura(); // liga e vai para 50
    // System.out.println(forno.ligado() == true);
    // System.out.println(forno.temperatura() == 50); // 50
    // forno.aumentarTemperatura();
    // System.out.println(forno.temperatura() == 100); // 100
    // forno.aumentarTemperatura();
    // System.out.println(forno.temperatura() == 150); // 150
    // forno.aumentarTemperatura();
    // System.out.println(forno.temperatura() == 200); // 200
    // forno.aumentarTemperatura();
    // // é isso mesmo, há um step intermediário entre 200 e 250
    // System.out.println(forno.temperatura() == 220); // 220
    // forno.aumentarTemperatura();
    // System.out.println(forno.temperatura() == 250); // 250
    // forno.aumentarTemperatura();
    // System.out.println(forno.temperatura() == 300); // 300

    // forno.aumentarTemperatura(); // já está no máximo
    // System.out.println(forno.temperatura() == 300); // 300
    // System.out.println(forno.ligado() == true);

    // // reduzindo
    // forno.diminuirTemperatura();
    // forno.diminuirTemperatura();
    // forno.diminuirTemperatura();
    // System.out.println(forno.temperatura() == 200); // 200

    // // desligando direto
    // forno.desligar();
    // System.out.println(forno.ligado() == false);
    // System.out.println(forno.temperatura() == 0);

    // // já está desligado
    // forno.diminuirTemperatura();
    // System.out.println(forno.ligado() == false);
    // System.out.println(forno.temperatura() == 0);

    // // timer de 1 a 120 minutos
    // forno.setTimer(15); // minutos

    // forno.aumentarTemperatura();
    // forno.aumentarTemperatura();
    // forno.aumentarTemperatura();

    // System.out.println(forno.ligado() == true);
    // System.out.println(forno.temperatura() == 150);
    // System.out.println(forno.tempoRestante() == 15);

    // forno.tick(); // tick do timer (baixa 1min)
    // System.out.println(forno.tempoRestante() == 14);

    // // +4 ticks
    // forno.tick(); forno.tick(); forno.tick(); forno.tick();
    // System.out.println(forno.tempoRestante() == 10);
    // System.out.println(forno.ligado() == true);
    // System.out.println(forno.temperatura() == 150);

    // // +10 ticks e o forno é desligado ao fim do timer
    // forno.tick(); forno.tick(); forno.tick(); forno.tick(); forno.tick();
    // forno.tick(); forno.tick(); forno.tick(); forno.tick(); forno.tick();
    // System.out.println(forno.tempoRestante() == 0);
    // System.out.println(forno.temperatura() == 0);
    // System.out.println(forno.ligado() == false);

    // // novo timer
    // forno.setTimer(120);
    // forno.aumentarTemperatura(); forno.aumentarTemperatura();
    // System.out.println(forno.ligado() == true);
    // System.out.println(forno.temperatura() == 100);
    // System.out.println(forno.tempoRestante() == 120);

    // while (forno.ligado()) forno.tick(); // tick até desligar

    // System.out.println(forno.tempoRestante() == 0);
    // System.out.println(forno.ligado() == false);
    // System.out.println(forno.temperatura() == 0);
  }
}