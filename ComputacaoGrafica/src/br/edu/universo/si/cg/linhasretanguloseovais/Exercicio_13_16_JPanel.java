package br.edu.universo.si.cg.linhasretanguloseovais;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_16_JPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        try {
            super.paintComponent(g);
            
            int[] xValuesFrente = { 100, 160, 160, 100 };
            int[] yValuesFrente = { 100, 100, 160, 160 };
            g.setColor(Color.lightGray);
            g.fillPolygon(xValuesFrente, yValuesFrente, 4);
            g.setColor(Color.black);
            g.drawPolygon(xValuesFrente, yValuesFrente, 4);

            int[] xValuesTopo = { 100, 120, 180, 160 }; 
            int[] yValuesTopo = { 100, 80, 80, 100 };
            g.setColor(Color.lightGray);
            g.fillPolygon(xValuesTopo, yValuesTopo, 4);
            g.setColor(Color.black);
            g.drawPolygon(xValuesTopo, yValuesTopo, 4);
            
            int[] xValuesLado = { 160, 160, 180, 180 };
            int[] yValuesLado = { 160, 100, 80, 140 };
            g.setColor(Color.lightGray);
            g.fillPolygon(xValuesLado, yValuesLado, 4);
            g.setColor(Color.black);
            g.drawPolygon(xValuesLado, yValuesLado, 4);
        }
        catch (Exception ex) {
            
        }
    }
    
}
