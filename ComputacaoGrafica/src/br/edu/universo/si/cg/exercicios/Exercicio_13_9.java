/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.universo.si.cg.exercicios;

import javax.swing.JFrame;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 13.9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Exercicio_13_9_JPanel panel = new Exercicio_13_9_JPanel();
        frame.add(panel);
        frame.setSize(700, 100);
        frame.setVisible(true);
    }
}
