package br.edu.universo.si.cg.manipulandofontes;

import javax.swing.JFrame;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 13.10");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Exercicio_13_10_JPanel panel = new Exercicio_13_10_JPanel();
        frame.add(panel);
        frame.setSize(600, 100);
        frame.setVisible(true);
    }
}
