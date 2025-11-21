package isp;

public class Serhumano implements IComer, ITrabalhar {
    @Override
    public void comer() {
        System.out.println("O ser humano está comendo.");
    }

    @Override
    public void trabalhar() {
        System.out.println("O ser humano está trabalhando.");
    }
    
}
