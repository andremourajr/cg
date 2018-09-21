package br.edu.universo.si.cg.exercicios;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_6_JPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawArc(10, 10, 50, 50, 0, 360);
        g.drawArc(70, 10, 50, 50, 0, 360);
        g.drawArc(130, 10, 50, 50, 0, 360);
        g.drawArc(190, 10, 50, 50, 0, 360);
        g.drawArc(250, 10, 50, 50, 0, 360);
        g.drawArc(310, 10, 50, 50, 0, 360);
        g.drawArc(370, 10, 50, 50, 0, 360);
        g.drawArc(430, 10, 50, 50, 0, 360);
    }
}
