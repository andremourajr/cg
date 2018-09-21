package br.edu.universo.si.cg.manipulandofontes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author andremourajr
 */
public class Exercicio_13_10_JPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        SecureRandom random = new SecureRandom();
        
        char[] letras = new char[26*2];
        //letras maiúsculas: A=65, Z=90
        for (int i=65; i<=90; i++) {
            letras[i-65] = (char)i;
        }
        //letras minúsculas: a=97, z=122
        for (int i=97; i<=122; i++) {
            letras[i-71] = (char)i;
        }
        
        int[] tamanhos = { 28, 30, 32, 34, 36, 38, 40 };
        
        Font[] fontes = { new Font("Serif", Font.BOLD, tamanhos[random.nextInt(tamanhos.length)]),
            new Font("Monospaced", Font.ITALIC, tamanhos[random.nextInt(tamanhos.length)]),
            new Font("SansSerif", Font.PLAIN, tamanhos[random.nextInt(tamanhos.length)]),
            new Font("Serif", Font.BOLD + Font.ITALIC, tamanhos[random.nextInt(tamanhos.length)])
        };
        
        for (int i=0; i<15; i++) {
            g.setFont(fontes[random.nextInt(fontes.length)]);
            g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g.drawString(String.valueOf(letras[random.nextInt(letras.length)]), 30*i+30, 40);
        }
    }    
}
