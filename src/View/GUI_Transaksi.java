package View;

import Controller.ControllerTransaksi;
import Model.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static javax.swing.text.html.HTML.Tag.DT;

public class GUI_Transaksi extends javax.swing.JFrame {

    private ControllerTransaksi Controller;
    private ArrayList<Transaksi> arrTransaksi;
    private Integer Harga_total;
    private Integer Kembali;
    
    public GUI_Transaksi() throws SQLException
    {
        initComponents();
        Harga_total = 0;
        Kembali = 0;
        Controller = new ControllerTransaksi();
        arrTransaksi = new ArrayList<>();
        showCBNamaPelanggan();
        showCBNamaPesanan();
        //showtbTransaksi();
        showKembalian();
        tfTotal.disable();
        tfKembalian.disable();
        
        
        
    }

    public void showCBNamaPesanan() throws SQLException
    {
        DefaultComboBoxModel dcbmNamaPesanan = new DefaultComboBoxModel();
        for (Pesanan p : Controller.getDataPesanan())
        {
            dcbmNamaPesanan.addElement(p.getNama_pesanan());
        }
        CBNamaPesanan.removeAllItems();
        CBNamaPesanan.setModel(dcbmNamaPesanan);
    }
    
    public void showCBNamaPelanggan() throws SQLException
    {
        DefaultComboBoxModel dcbmNamaPelanggan = new DefaultComboBoxModel();
        for (Pelanggan p : Controller.getDataPelanggan())
        {
            dcbmNamaPelanggan.addElement(p.getNama_pelanggan());
        }
        CBNamaPelanggan.removeAllItems();
        CBNamaPelanggan.setModel(dcbmNamaPelanggan);
    }
    
    /*public void showtbTransaksi() throws SQLException{
        DefaultTableModel dtmtransaksi = new DefaultTableModel(new String[]{
            "Nama Pesanan", "Jumlah Pesanan","Harga Pesanan"},0);
        tbTransaksi.setModel(dtmtransaksi);
        
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBNamaPesanan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tfJumlah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        tfBayar = new javax.swing.JTextField();
        tfKembalian = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTransaksi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        CBNamaPelanggan = new javax.swing.JComboBox<>();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nama Pelanggan");

        jLabel4.setText("Nama Pesanan");

        CBNamaPesanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBNamaPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNamaPesananActionPerformed(evt);
            }
        });

        jLabel5.setText("Jumlah Pesanan");

        jLabel6.setText("Total Harga");

        jLabel7.setText("Bayar");

        jLabel3.setText("Kembalian");

        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        tfBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBayarActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tbTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbTransaksi);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("PEMESANAN");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("TRANSAKSI");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("TABEL TRANSAKSI");

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        CBNamaPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBNamaPelanggan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBNamaPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(tfBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(CBNamaPelanggan))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBNamaPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnBayar)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKembali)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBNamaPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNamaPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBNamaPesananActionPerformed
    
    public void showTotalharga(){
        tfTotal.setText(Harga_total.toString());
    }
    public void showKembalian(){
        tfKembalian.setText(Kembali.toString());
    }
    
    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        Transaksi tr = new Transaksi();
        try {
            tr.setPelanggan(Controller.getDataPelanggan().get(CBNamaPelanggan.getSelectedIndex()));
            tr.setPesanan(Controller.getDataPesanan().get(CBNamaPesanan.getSelectedIndex()));
            tr.setJumlah_pesanan(Integer.parseInt(tfJumlah.getText()));
            
            Harga_total += Controller.getDataPesanan().get(CBNamaPesanan.getSelectedIndex()).getHarga_pesanan()*Integer.parseInt(tfJumlah.getText());
            tr.setTotal_harga(Harga_total);
            
            this.showTotalharga();
            Harga_total = 0;
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        Transaksi tr = new Transaksi();
        try {            
            tr.setPelanggan(Controller.getDataPelanggan().get(CBNamaPelanggan.getSelectedIndex()));
            tr.setPesanan(Controller.getDataPesanan().get(CBNamaPesanan.getSelectedIndex()));
            tr.setJumlah_pesanan(Integer.parseInt(tfJumlah.getText()));
            
            Harga_total += Controller.getDataPesanan().get(CBNamaPesanan.getSelectedIndex()).getHarga_pesanan() * Integer.parseInt(tfJumlah.getText());
            
            tr.setTotal_harga(Harga_total);
            tr.setBayar(Integer.parseInt(tfBayar.getText()));
            
            Kembali = Integer.parseInt(tfBayar.getText()) - Integer.parseInt(tfTotal.getText());
            tr.setKembalian(Kembali);
            Controller.insertTransaksi(tr);
            showTBTransaksi();
            showTotalharga();
            showKembalian();
            Harga_total = 0;
            Kembali = 0;
        }catch(SQLException ex){
            Logger.getLogger(GUI_Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    public void showTBTransaksi() throws SQLException{
        DefaultTableModel dtmTransaksi = new DefaultTableModel(new String[]{
            "Id Transaksi","Jumlah Pesanan", "Total Harga"},0);
        for (Transaksi tr : Controller.getDataTransaksi()){
            dtmTransaksi.addRow(new String[]{
                tr.getId_transaksi().toString(),
                tr.getJumlah_pesanan().toString(),
                tr.getTotal_Harga().toString()
            });
        }
        tbTransaksi.setModel(dtmTransaksi);
    }
    
    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalActionPerformed

    private void tfBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBayarActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new GUI_Pilihan().show();
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

            
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
            java.util.logging.Logger.getLogger(GUI_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBNamaPelanggan;
    private javax.swing.JComboBox<String> CBNamaPesanan;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tbTransaksi;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfJumlah;
    private javax.swing.JTextField tfKembalian;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
