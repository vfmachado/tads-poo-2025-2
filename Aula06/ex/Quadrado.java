package Aula06.ex;

import java.awt.Color;
import java.awt.Graphics;

public class Quadrado extends FormaGeometrica {

    private int lado;

    public Quadrado(int lado, Color cor) {
        this.lado = lado;
        setCor(cor);
    }

    @Override
    void setNome() {
        this.nome = "QUADRADO";
    }

    @Override
    float calculoArea() {
        return lado * lado;
    }   

    @Override
    public void desenhar(int x, int y, Graphics g) {
        g.setColor(this.getCor());
        g.fillRect(x, y, lado, lado);
    }
    
}
