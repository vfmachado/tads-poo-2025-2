package domain;

import java.util.Arrays;
import java.util.List;

public class Gabarito {
    
    private List<String> respostas;

    public Gabarito(String valoresRespostas) {
        // split da string transforma o texto em um array "abc" => ["a", "b", "c"]
        this.respostas = Arrays.asList(valoresRespostas.split(""));
        
        // for (int i = 0; i < respostas.size(); i++) {
        //     System.out.println("QUESTAO " + (i+1) + " ALTERNATIVA " + respostas.get(i) );
        // }
    }

    public String getRespostaQuestao(int numero) {
        if (numero < 0 || numero >= respostas.size()) {
            System.out.println("REPOSTA QUE NAO EXISTE");
            return null;
        }
        return respostas.get(numero);
    }

}
