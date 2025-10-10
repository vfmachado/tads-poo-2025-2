package src.controller;

import java.awt.Graphics;

import src.model.Item;
import src.model.Player;

public class Controle {
    
    private Player player;
    private Item item;

    public Controle() {
        this.player = new Player();
        this.item = new Item();
    }


    public void atualizar() {
        this.player.mover();

        //System.out.println(player.getX() + " / " + this.item.getX());
        // teste de colisao
        if (this.player.getX() + 30 >= this.item.getX() && this.player.getX() <= this.item.getX() + 20) {
            //System.out.println("COLIDE HORIZONTALMENTE");
            if ( player.getY() + 30 >= item.getY() && player.getY() <= item.getY() - 20) {
                System.out.println("PONTUOU!");
                item = new Item();
            }
        }
    }

    public void desenhar(Graphics g) {
        player.desenhar(g);
        item.desenhar(g);
    }


    public void setDirecao(char c) {
        player.setDirecao(c);
    }
}
