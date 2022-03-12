
package z;

import java.awt.Font;
import javax.swing.JFrame;


public class Biodata_pemesanan extends javax.swing.JFrame {
public String no;
public String g;
public String Jenis_Kamar;
    private Object nama;
  
    public Biodata_pemesanan() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kode = new javax.swing.JComboBox();
        n = new javax.swing.JTextField();
        jenis_1 = new javax.swing.JRadioButton();
        jenis_2 = new javax.swing.JRadioButton();
        jenis_3 = new javax.swing.JRadioButton();
        jenis_4 = new javax.swing.JRadioButton();
        harga = new javax.swing.JButton();
        tanggal = new javax.swing.JComboBox();
        bulan = new javax.swing.JComboBox();
        tahun = new javax.swing.JComboBox();
        tanggal_2 = new javax.swing.JComboBox();
        bulan_2 = new javax.swing.JComboBox();
        tahun_2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        alhamdulillah = new javax.swing.JTextArea();
        batal = new javax.swing.JButton();
        Pesan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        j = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        g1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ju = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No Booking");

        jLabel2.setText("Nama Pemesan");

        jLabel3.setText("Jenis kamar");

        jLabel4.setText("kedatangan");

        jLabel5.setText("keberangkatan");

        kode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        buttonGroup1.add(jenis_1);
        jenis_1.setText("VVIP");
        jenis_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jenis_2);
        jenis_2.setText("VIP");

        buttonGroup1.add(jenis_3);
        jenis_3.setText("Mewah");

        buttonGroup1.add(jenis_4);
        jenis_4.setText("Sederhana");

        harga.setText("Harga");
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        tanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });

        bulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        tahun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahun", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));

        tanggal_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        tanggal_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggal_2ActionPerformed(evt);
            }
        });

        bulan_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        bulan_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulan_2ActionPerformed(evt);
            }
        });

        tahun_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahun", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));

        alhamdulillah.setColumns(20);
        alhamdulillah.setRows(5);
        alhamdulillah.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(alhamdulillah);

        batal.setText("batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        Pesan.setText("pesan");
        Pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesanActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        j.setText("hasil");

        jLabel7.setText("No HP");

        jLabel8.setText("Fasilitas");

        g1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "AC", "Televisi", "Kulkas", "null" }));

        jLabel6.setText("Lama nginap");

        lam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamActionPerformed(evt);
            }
        });

        jLabel9.setText("Jumlah");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Silahkan Memesan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(44, 44, 44)
                                .addComponent(g1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jenis_1)
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jenis_2)
                                            .addComponent(jenis_4)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jenis_3)
                                        .addComponent(n, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(hp))))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(8, 8, 8)
                                .addComponent(tanggal_2, 0, 73, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bulan, 0, 67, Short.MAX_VALUE)
                                    .addComponent(bulan_2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tahun, 0, 59, Short.MAX_VALUE)
                                    .addComponent(tahun_2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lam)
                                    .addComponent(ju))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jenis_1)
                            .addComponent(jenis_2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenis_3)
                            .addComponent(jenis_4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(ju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tanggal_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bulan_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahun_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(35, 35, 35)
                        .addComponent(j)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batal)
                    .addComponent(Pesan)
                    .addComponent(Hapus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesanActionPerformed
        String
                Kode_Booking,Nama_Pemesan,Jenis_Kamar = null,Kedatangan = null,Keberangkatan = null,
                Harga_Kamar;
        Font biasa=new
               Font("Monospace",Font.PLAIN,12);
        ////
        if(jenis_1.isSelected()){
            Jenis_Kamar=jenis_1.getText();
        }else if(jenis_2.isSelected()){
            VIP a = new VIP();
            Jenis_Kamar=jenis_2.getText();
        }else if(jenis_3.isSelected()){
            Jenis_Kamar=jenis_3.getText();
        }else if(jenis_4.isSelected()){
            Jenis_Kamar=jenis_4.getText();
        }else{
            Jenis_Kamar=("");
        }
        ////
        //
        for (int i=1;i<=31;i++){
            tanggal.addItem(""+i);
       }
       // 
        for (int i=1;i<=12;i++){
            bulan.addItem(""+i);
       }
        // 
        for (int i=2017;i>=2010;i-=1){
            tahun.addItem(""+i);
       } 
        ////
        //
        for (int i=1;i<=31;i++){
           tanggal_2.addItem(""+i);
       }
       // 
        for (int i=1;i<=12;i++){
            bulan_2.addItem(""+i);
       }
        // 
        for (int i=2017;i>=2010;i-=1){
            tahun_2.addItem(""+i);
       } 
        ////
        //
        if(tanggal.getSelectedItem()==""){
        }else if(bulan.getSelectedItem()==""){
        }else if(tahun.getSelectedItem()!=""){
            Kedatangan=("");
        }else{
        }
        if(tanggal_2.getSelectedItem()==""){
        }else if(bulan_2.getSelectedItem()==""){
        }else if(tahun_2.getSelectedItem()==""){
        }else{
        Keberangkatan=("");
        }
        ////
        //
         g   = g1.getSelectedItem().toString();
        ////
         no = kode.getSelectedItem().toString();
        //
         alhamdulillah.setText("No Booking  : "+no
               +"\nEmail    : "+Tampilan_awal.Email.getText()
               +"\nPasword  :  Hanya Pemilik yang tau"
               +"\nNama Pemesan : "+n.getText()
               +"\nNo HP    : "+hp.getText()
               +"\nKedatangan : "+tanggal.getSelectedItem()+" - "+bulan.getSelectedItem()+" - "+tahun.getSelectedItem()
               +"\nKeberangkatan : "+tanggal_2.getSelectedItem() +" - "+bulan_2.getSelectedItem()+" - "+tahun_2.getSelectedItem()
               +"\nJenis Kamar : "+Jenis_Kamar
               +"\nBerapa Lama Menginap : "+lam.getText()
               +"\nTotal pembayaran     : "+ju.getText()
               +"\nFasilitas            : "+g
               +"\n"
               +"\n  TERIMA KASIH SUDAH BERKUNJUNG");
       alhamdulillah.setFont(biasa);
    }//GEN-LAST:event_PesanActionPerformed

    
    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
       alhamdulillah.setText("");
    }//GEN-LAST:event_batalActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        n.setText("");
        hp.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    private void tanggal_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggal_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggal_2ActionPerformed

    private void bulan_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulan_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulan_2ActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        if(jenis_1.isSelected()){
            Jenis_Kamar=jenis_1.getText();
            VVIP a = new VVIP();
            a.setVisible(true);
            a.pack();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            VVIP.kamar.setText("Kamar VVIP");
        }else if(jenis_2.isSelected()){
            VIP a = new VIP();
            a.setVisible(true);
            a.pack();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Jenis_Kamar=jenis_2.getText();
            VIP.kamar1.setText("Kamar VIP");
        }else if(jenis_3.isSelected()){
            ZMewah a = new ZMewah();
            a.setVisible(true);
            a.pack();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Jenis_Kamar=jenis_3.getText();
            ZMewah.kama.setText("Kamar Mewah");
        }else if(jenis_4.isSelected()){
            ZSederhana a = new ZSederhana();
            a.setVisible(true);
            a.pack();
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Jenis_Kamar=jenis_4.getText();
            ZSederhana.ja.setText("Kamar Sederhana");
        }else{
            Jenis_Kamar=("");
        }
    }//GEN-LAST:event_hargaActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void jenis_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_1ActionPerformed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

    private void lamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamActionPerformed

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
            java.util.logging.Logger.getLogger(Biodata_pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biodata_pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biodata_pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biodata_pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biodata_pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Pesan;
    private javax.swing.JTextArea alhamdulillah;
    private javax.swing.JButton batal;
    private javax.swing.JComboBox bulan;
    private javax.swing.JComboBox bulan_2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox g1;
    private javax.swing.JButton harga;
    private javax.swing.JTextField hp;
    private javax.swing.JLabel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jenis_1;
    private javax.swing.JRadioButton jenis_2;
    private javax.swing.JRadioButton jenis_3;
    private javax.swing.JRadioButton jenis_4;
    public static javax.swing.JTextField ju;
    private javax.swing.JComboBox kode;
    public static javax.swing.JTextField lam;
    private javax.swing.JTextField n;
    private javax.swing.JComboBox tahun;
    private javax.swing.JComboBox tahun_2;
    private javax.swing.JComboBox tanggal;
    private javax.swing.JComboBox tanggal_2;
    // End of variables declaration//GEN-END:variables
}
