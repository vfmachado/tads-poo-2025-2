package src.view;

import javax.swing.JFrame;

public class JanelaJogo extends JFrame {
    
    public JanelaJogo() {
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(600, 600);

        this.add(new PainelJogo());
        this.pack();    // calcula automaticamente o tamanho da janela com base no tamanho do painel
        this.setVisible(true);

    }

}
