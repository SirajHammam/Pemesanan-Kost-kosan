/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z;

import static z.VVIP.kamar;
import static z.VVIP.nginap;
import static z.VVIP.wow;

/**
 *
 * @author TIUNIDA12
 */
public class ZMewah extends javax.swing.JFrame {
    static Object kamar2;

    /**
     * Creates new form Mewah
     */
    public ZMewah() {
        initComponents();
        
        kama.setEnabled(false);
        kumpul.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jumlah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        kumpul = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kama = new javax.swing.JTextField();
        nginap2 = new javax.swing.JTextField();
        wow2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(385, 300));
        getContentPane().setLayout(null);

        jLabel1.setText("Kamar Pilihan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 100, 14);

        jLabel2.setText("Berapa bulan menginap");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 130, 14);

        jumlah.setText("Jumlah");
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah);
        jumlah.setBounds(30, 130, 310, 30);

        jButton2.setText("hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 210, 144, 30);

        kumpul.setText("kumpul");
        kumpul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kumpulActionPerformed(evt);
            }
        });
        getContentPane().add(kumpul);
        kumpul.setBounds(190, 210, 144, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PEMESANAN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 10, 104, 26);
        getContentPane().add(kama);
        kama.setBounds(170, 50, 170, 30);
        getContentPane().add(nginap2);
        nginap2.setBounds(170, 90, 170, 30);
        getContentPane().add(wow2);
        wow2.setBounds(30, 170, 310, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/z/hi.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 440, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kumpulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kumpulActionPerformed
        Biodata_pemesanan.lam.setText(nginap2.getText());
        Biodata_pemesanan.ju.setText(wow2.getText());
        this.dispose();
    }//GEN-LAST:event_kumpulActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        double t,h,b;
        t=Double.parseDouble(String.valueOf(nginap2.getText()));
        b=1.0;
        h=t*b;
        wow2.setText(h+"00000");
    }//GEN-LAST:event_jumlahActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        wow2.setText("");
        nginap2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ZMewah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZMewah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZMewah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZMewah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZMewah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jumlah;
    public static javax.swing.JTextField kama;
    private javax.swing.JButton kumpul;
    public static javax.swing.JTextField nginap2;
    public static javax.swing.JTextField wow2;
    // End of variables declaration//GEN-END:variables
}