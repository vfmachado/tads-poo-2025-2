package src.model;

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
