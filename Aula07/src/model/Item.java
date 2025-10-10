package src.model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
                    // GameObject
public class Item extends Posicao {
    private Random r = new Random();
    
    public Item() {
        
        super(0, 0);
        x = r.nextInt(550) + 50;
        y = r.nextInt(550) + 50;
    }

    public void desenhar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(this.getX(), this.getY(), 20, 20);
    }
}