package br.edu.universo.si.cg.showcolors;


import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andremourajr
 */
public class ShowColors {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Using colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(400, 180);
        frame.setVisible(true);
    }
}
