package br.edu.universo.si.cg.poligonosepolilinhas;

import javax.swing.JFrame;

public class DrawPolygons {
    // executa o aplicativo
    public static void main(String[] args) {
        // cria frame para PolygonsJPanel
        JFrame frame = new JFrame("Drawing Polygons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        PolygonsJPanel polygonsJPanel = new PolygonsJPanel();
        frame.add(polygonsJPanel);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }    
}
