package src.view;

import javax.swing.JFrame;

import src.controller.Controle;
import src.controller.IJogo;

public class JanelaJogo extends JFrame {
    
    public JanelaJogo() {
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(600, 600);

        IJogo jogo = new Controle();
        this.add(new PainelJogo(jogo));
        this.pack();    // calcula automaticamente o tamanho da janela com base no tamanho do painel
        this.setVisible(true);

    }

}
