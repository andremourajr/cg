package br.edu.universo.si.cg.manipulandofontes;

import javax.swing.JFrame;

public class Metrics {
    // executa o aplicativo
    public static void main(String[] args) {
        // cria frame para MetricsJPanel
        JFrame frame = new JFrame("Demonstrating FontMetrics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MetricsJPanel metricsJPanel = new MetricsJPanel();
        frame.add(metricsJPanel);
        frame.setSize(510, 240);
        frame.setVisible(true);
    }    
}
