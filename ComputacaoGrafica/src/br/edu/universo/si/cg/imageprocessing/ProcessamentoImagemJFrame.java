/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.universo.si.cg.imageprocessing;



import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author andremourajr
 */
public class ProcessamentoImagemJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProcessamentoImagemJFrame
     */
    public ProcessamentoImagemJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Selecionar Imagem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(jLabel1)
                    .addContainerGap(684, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jLabel1)
                    .addContainerGap(362, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Original", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(jLabel2)
                    .addContainerGap(684, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jLabel2)
                    .addContainerGap(362, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("P&B 1", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(jLabel3)
                    .addContainerGap(684, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jLabel3)
                    .addContainerGap(362, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("P&B 2", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(jLabel4)
                    .addContainerGap(684, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jLabel4)
                    .addContainerGap(362, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("P&B 3", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(869, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(460, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tons de Azul", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            jLabel1.setIcon(new ImageIcon(path));
            try {
                BufferedImage buffImage = ImageIO.read(new File(path));
                BufferedImage imagePB1 = new BufferedImage(buffImage.getWidth(), buffImage.getHeight(), BufferedImage.TYPE_INT_RGB);
                BufferedImage imagePB2 = new BufferedImage(buffImage.getWidth(), buffImage.getHeight(), BufferedImage.TYPE_INT_RGB);
                BufferedImage imagePB3 = new BufferedImage(buffImage.getWidth(), buffImage.getHeight(), BufferedImage.TYPE_INT_RGB);
                BufferedImage imageBlue = new BufferedImage(buffImage.getWidth(), buffImage.getHeight(), BufferedImage.TYPE_INT_RGB);
                int[][] pixelsRGB = new int[buffImage.getWidth()][buffImage.getHeight()];
                for (int i=0; i<pixelsRGB.length; i++) {
                    for (int j=0; j<pixelsRGB[i].length; j++) {
                        pixelsRGB[i][j] = buffImage.getRGB(i, j);
                        int[] argb = getRGBFromPixel(pixelsRGB[i][j]);
                        System.out.printf("Pixel[%d][%d]: %d, R: %d, G: %d, B: %d%n", i, j, pixelsRGB[i][j], argb[1], argb[2], argb[3]);
                        imagePB1.setRGB(i, j, (new Color(argb[1], argb[1], argb[1])).getRGB());
                        imagePB2.setRGB(i, j, (new Color(argb[2], argb[2], argb[2])).getRGB());
                        imagePB3.setRGB(i, j, (new Color(argb[3], argb[3], argb[3])).getRGB());
                        imageBlue.setRGB(i, j, (new Color((argb[1] > 250 ? 0 : argb[1]), (argb[2] > 250 ? 0 : argb[2]), 255)).getRGB());
                        //Criar mais uma aba e mostrar a imagen em tons de sepia
                        //Criar mais uma aba e mostrar a imagem em tons de amarelo
                    }
                }
                File file = fileChooser.getSelectedFile();
                ImageIO.write(imagePB1, "png", new File(file.getParent() + File.separator + file.getName() + "_pb1.png"));
                ImageIO.write(imagePB2, "png", new File(file.getParent() + File.separator + file.getName() + "_pb2.png"));
                ImageIO.write(imagePB3, "png", new File(file.getParent() + File.separator + file.getName() + "_pb3.png"));
                ImageIO.write(imageBlue, "png", new File(file.getParent() + File.separator + file.getName() + "_blue.png"));
                jLabel2.setIcon(new ImageIcon(imagePB1));
                jLabel3.setIcon(new ImageIcon(imagePB2));
                jLabel4.setIcon(new ImageIcon(imagePB3));
                jLabel5.setIcon(new ImageIcon(imageBlue));
                jTabbedPane1.setSelectedIndex(0);
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private int[] getRGBFromPixel(int pixel) {
        int[] argb = new int[4];
        argb[0] = (pixel>>24) & 0xff; //alpha
        argb[1] = (pixel>>16) & 0xff; //red
        argb[2] = (pixel>>8) & 0xff; //green
        argb[3] = pixel & 0xff; //blue
        return argb;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProcessamentoImagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcessamentoImagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcessamentoImagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcessamentoImagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessamentoImagemJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
