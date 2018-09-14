package br.edu.universo.si.cg.poligonosepolilinhas;

import javax.swing.JFrame;

/**
 *
 * @author andremourajr
 */
public class ExercicioPoligonosMain {
    public static void main(String[] args) {
        // cria frame para PolygonsJPanel
        JFrame frame = new JFrame("Exercícios Polígonos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        ExercicioPoligonos ex = new ExercicioPoligonos();
        frame.add(ex);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
}
