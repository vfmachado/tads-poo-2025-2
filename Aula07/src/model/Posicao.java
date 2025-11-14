package src.model;

// ABSTRATA E VISIVEL APENAS NO PACKAGE
abstract class Posicao {

    protected int x;
    protected int y;

    public Posicao(int posx, int posy) {
        this.x = posx;
        this.y = posy;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    
}
