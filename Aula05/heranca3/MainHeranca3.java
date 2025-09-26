package heranca3;


public class MainHeranca3 {
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        f.setNome("ALE");
        f.setSalario(6000);

        Gerente g = new Gerente("DIRECAO");
        g.setNome("CRIS");
        g.setSalario(10000);;

        System.out.println(f);
        System.out.println(g);
    }
}