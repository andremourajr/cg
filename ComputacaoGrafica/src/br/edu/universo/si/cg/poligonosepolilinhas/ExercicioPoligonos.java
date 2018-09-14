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
        
        int[] xValues = {10, 20, 30, 40, 30, 20, 10}; 
        int[] yValues = {10, 20, 20, 10, 20, 20, 10};
        g.drawPolygon(xValues, yValues, 6);
        
    }
}
