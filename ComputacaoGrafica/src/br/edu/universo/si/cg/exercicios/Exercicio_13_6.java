package br.edu.universo.si.cg.exercicios;

import javax.swing.JFrame;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 13.6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Exercicio_13_6_JPanel panel = new Exercicio_13_6_JPanel();
        frame.add(panel);
        frame.setSize(500, 200);
        frame.setVisible(true);
    } 
}
