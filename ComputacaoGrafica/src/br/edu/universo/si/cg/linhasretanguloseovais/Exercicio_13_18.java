package br.edu.universo.si.cg.linhasretanguloseovais;

import javax.swing.JFrame;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_18 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 13.10");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Exercicio_13_18_JPanel panel = new Exercicio_13_18_JPanel();
        frame.add(panel);
        frame.setSize(1200, 700);
        frame.setVisible(true);
    }
}
