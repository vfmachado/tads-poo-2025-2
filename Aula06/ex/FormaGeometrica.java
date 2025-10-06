package Aula06.ex;

import java.awt.Color;

abstract class FormaGeometrica implements IDesenhavel {
    
    private int x, y;

    protected String nome;
    private Color cor;

    public String getNome() {
        return this.nome;
    }

    abstract void setNome();

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    };

    abstract float calculoArea();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
}
