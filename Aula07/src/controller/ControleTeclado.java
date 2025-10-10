package src.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControleTeclado implements KeyListener {
    
    private Controle controle;

    public ControleTeclado(Controle controle) {
        this.controle = controle;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {

        // System.out.println("TECLA PRESSIONADA " + e.getKeyChar());

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> controle.setDirecao('U');
            case KeyEvent.VK_S -> controle.setDirecao('D');
            case KeyEvent.VK_A -> controle.setDirecao('L');
            case KeyEvent.VK_D -> controle.setDirecao('R');
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

}
