package src.controller;

import java.awt.Graphics;

public interface IJogo {

    public void atualizar();
    public void desenhar(Graphics g);
    public void setDirecao(char c);
}
