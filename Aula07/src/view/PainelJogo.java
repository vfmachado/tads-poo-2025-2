package src.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import src.controller.IJogo;
import src.controller.ControleTeclado;

/*
 * vai lidar com a janela + entrada (teclado) do SO para o software
 */
public class PainelJogo extends JPanel implements ActionListener {
    
    private final int WIDTH = 600;
    private final int HEIGHT = 600;

    private final int FPS = (int) (1000/60);    // 60 frames

    private Timer timer;
    private IJogo jogo;  // nao é um game pad / isso é a classe que contem a logica do jogo (controller do MVC)

    public PainelJogo(IJogo jogo) {
        this.jogo  = jogo;
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // this.setBackground(Color.BLACK); nao funfou

        this.addKeyListener(new ControleTeclado(jogo));;
        this.setFocusable(true);

        timer = new Timer(FPS, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // chama o paint component default (limpa a tela)
        jogo.desenhar(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jogo.atualizar();
        repaint();
    }
}
