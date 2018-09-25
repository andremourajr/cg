package br.edu.universo.si.cg.linhasretanguloseovais;

import javax.swing.JFrame;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_16 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 13.16");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Exercicio_13_16_JPanel panel = new Exercicio_13_16_JPanel();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
