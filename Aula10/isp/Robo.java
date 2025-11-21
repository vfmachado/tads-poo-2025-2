package isp;

public class Robo implements ITrabalhar {
    @Override
    public void trabalhar() {
        System.out.println("O robô está trabalhando.");
    }
}

// RUIM
// public class Robo implements IHumano {
//     @Override
//     public void trabalhar() {
//         System.out.println("O robô está trabalhando.");
//     }

//     @Override
//     public void comer() {
//         // Robôs não comem, então este método pode ficar vazio ou lançar uma exceção
//         throw new UnsupportedOperationException("Robôs não comem.");
//     }
// }
