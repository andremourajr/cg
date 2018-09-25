package br.edu.universo.si.cg.linhasretanguloseovais;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_18_JPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        try {
            super.paintComponent(g);
            SecureRandom random = new SecureRandom();

            int[] pontoInicial = { random.nextInt(1200), random.nextInt(700) };

            for (int i=0; i<100; i++) {
                g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
                g.drawLine(pontoInicial[0], pontoInicial[1], random.nextInt(1200), random.nextInt(700));
                
                //Thread.sleep(50);
            }
            //Thread.sleep(1000);
            this.repaint();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
