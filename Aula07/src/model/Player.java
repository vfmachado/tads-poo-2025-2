package src.model;

import java.awt.Color;
import java.awt.Graphics;
// testar o comportamento do player isoladamente eu consigo!
public class Player extends Posicao {
    
    private int velocidade;
    private char dir;
    private final int tamanho;

    public Player() {
        super(0, 0);
        tamanho = 30;
        
        velocidade = 5;
        dir = 'R';
    }


    public void mover() {
        // U - up
        // D - down
        // L - left
        // R - right
        if (dir == 'R') {
            this.x += velocidade;
        }

        if (dir == 'L') {
            this.x -= velocidade;
        }

        if (dir == 'D') {
            this.y += velocidade;
        }

        if (dir == 'U') {
            this.y -= velocidade;
        }

    }

    public void desenhar(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(this.x, this.y, tamanho, tamanho);
        
    }

    public void setDirecao(char c) {
        this.dir = c;
    }


}   
