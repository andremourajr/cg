/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.universo.si.cg.poligonosepolilinhas;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author andremourajr
 */
public class ExercicioPoligonos extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int[] xValues = {20, 40, 60, 80, 60, 40, 20}; 
        int[] yValues = {40, 20, 20, 40, 60, 60, 40};
        g.fillPolygon(xValues, yValues, 6);
        
    }
}
