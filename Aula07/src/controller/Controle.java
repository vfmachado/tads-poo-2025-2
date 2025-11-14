package src.controller;

import java.awt.Graphics;

import src.model.Item;
import src.model.Player;
// import src.model.Posicao; // NAO POSSO ACESSAR   

// CONTROLE FOI CHAMADO ASSIM POR CONTA DA CAMADA CONTROLLER
public class Controle implements IJogo {
    
    private Player player;
    private Item item;

    public Controle() {
        this.player = new Player();
        this.item = new Item();
    }

    @Override
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

    @Override
    public void desenhar(Graphics g) {
        player.desenhar(g);
        item.desenhar(g);
    }

    @Override
    public void setDirecao(char c) {
        player.setDirecao(c);
    }
}
