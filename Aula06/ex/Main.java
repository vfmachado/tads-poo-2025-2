package Aula06.ex;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        List<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
        formas.add(new Quadrado(50, Color.blue));
        // formas.add(new Retangulo(100, 200, Color.red));
        // formas.add(new Circulo(30, Color.cyan));

        for (FormaGeometrica formaGeometrica : formas) {
            System.out.println(formaGeometrica.getNome());
            System.out.println(formaGeometrica.getCor());
            System.out.println(formaGeometrica.calculoArea());
            System.out.println();
        }

        // janela é puramente um container, nao da para adicionar muita coisa diretamente nela
        JFrame janela = new JFrame("TITULO DA JANELA");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 600);
        janela.setVisible(true);

        Painel p = new Painel();
        p.setBounds(0, 0, 800, 600);
        janela.add(p);
        p.setVisible(true);
        p.repaint();

    }
}
