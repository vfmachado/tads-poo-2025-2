package composicao;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    
    // inner class - classe interna
    private class Comodo {
        private String nome;
        
        Comodo(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return this.nome;
        }
    }

    private List<Comodo> comodos;
    
    public Casa() {
        comodos = new ArrayList<>();
        comodos.add(new Comodo("quarto"));
        comodos.add(new Comodo("banheiro"));
    }

    public void mostrarComodos() {
        for (Comodo comodo : comodos) {
            System.out.println(comodo.getNome());
        }
    }
}
