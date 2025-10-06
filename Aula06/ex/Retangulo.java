package Aula06.ex;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo extends FormaGeometrica {

    private int base;
    private int altura;

    public Retangulo(int base, int altura, Color cor) {
        this.base = base;
        this.altura = altura;
        setCor(cor);
        setNome();
    }

    @Override
    void setNome() {
        this.nome = "RETANGULO";
    }

    @Override
    float calculoArea() {
        return base * altura;
    }   
    
    @Override
    public void desenhar(int x, int y, Graphics g) {
        g.setColor(this.getCor());
        g.fillRect(x, y, base, altura);
    }
}
