package br.edu.universo.si.cg.showcolors2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
* @author Andre Moura
*/
public class ShowColors2JFrame extends JFrame {
    private final JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private final JPanel colorJPanel;
    
    public ShowColors2JFrame() {
        super("Using JColorChooser");
        
        //Cria JPanel para exibir as cores
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);
        
        //configura changeColorJButton e registra sua rotina de tratamento de evento
        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    color = JColorChooser.showDialog(ShowColors2JFrame.this, "Choose a Color", color);
                    
                    if (color == null)
                        color = Color.LIGHT_GRAY;
                    
                    colorJPanel.setBackground(color);
                }
            }
        );
        
        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorJButton, BorderLayout.SOUTH);
        
        setSize(400, 130);
        setVisible(true);
    }
}
