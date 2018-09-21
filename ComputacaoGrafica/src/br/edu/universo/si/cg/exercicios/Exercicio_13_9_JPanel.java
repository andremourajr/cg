package br.edu.universo.si.cg.exercicios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 * (Triângulos aleatórios) Escreva um aplicativo que exibe triângulos 
 * aleatoriamente gerados em diferentes cores. Cada triângulo deve ser 
 * preenchido com uma cor diferente. Utilize a classe GeneralPath e o método 
 * fill da classe Graphics2D para desenhar os triângulos.
 * @author andremourajr
 */
public class Exercicio_13_9_JPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        SecureRandom random = new SecureRandom();
        
        int[] xPoints = {10, 30, 50};
        int[] yPoints = {50, 10, 50}; 
        
        Graphics2D g2d = (Graphics2D)g;
        GeneralPath triangulo = new GeneralPath();
        triangulo.moveTo(xPoints[0], yPoints[0]);
        
        for (int i=0; i<xPoints.length; i++) {
            triangulo.lineTo(xPoints[i], yPoints[i]);
        }
        
        triangulo.closePath();
        
        for (int i=0; i<10; i++) {
            g2d.translate(i+50, 0);
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g2d.fill(triangulo);
        }   
    }
}
