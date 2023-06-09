/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.PembelianModel;

/**
 *
 * @author farhan
 */
public class RiwayatView extends javax.swing.JFrame {

 PembelianModel model = new PembelianModel();
 
    /**
     * Creates new form RiwayatView
     */
    public RiwayatView() {
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

        jMenu1 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelpembelian = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        barang = new javax.swing.JLabel();
        total_harga = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        batalkan = new javax.swing.JButton();
        jumlah = new javax.swing.JLabel();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        pesanan_selesai = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelpembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID barang", "Barang", "Jumlah", "Total Harga", "Status"
            }
        ));
        tabelpembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpembelianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelpembelian);

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Riwayat Pembelian");

        jButton2.setText("Lihat update data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ubah Pembelian");

        jLabel3.setText("Barang : ");

        jLabel4.setText("Jumlah");

        jLabel5.setText("Total : ");

        jLabel6.setText("Status : ");

        barang.setText("-");

        total_harga.setText("-");

        status.setText("-");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        batalkan.setText("Batalkan");
        batalkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalkanActionPerformed(evt);
            }
        });

        jumlah.setText("0");

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        pesanan_selesai.setText("Pesanan selesai");
        pesanan_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanan_selesaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(340, 340, 340)
                .addComponent(jLabel2)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(batalkan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(plus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jumlah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(minus))
                                    .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesanan_selesai)))
                .addGap(32, 76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(barang))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(plus)
                            .addComponent(minus)
                            .addComponent(jumlah))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(total_harga))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(status))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update)
                            .addComponent(batalkan))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(pesanan_selesai))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            this.model.getTableData(tabelpembelian);
        } catch (SQLException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelpembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpembelianMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelpembelian.getModel();
        
        String status_value = (String) model.getValueAt(tabelpembelian.getSelectedRow(), 4);
        String barang_value = (String) model.getValueAt(tabelpembelian.getSelectedRow(), 1);
        String jumlah_value = (String) model.getValueAt(tabelpembelian.getSelectedRow(), 2);
        String total_harga_value = (String) model.getValueAt(tabelpembelian.getSelectedRow(), 3);
        
        if(!status_value.equals("menunggu konfirmasi")){
            update.setEnabled(false);
            batalkan.setEnabled(false);
            plus.setEnabled(false);
            minus.setEnabled(false);
        }else{
            update.setEnabled(true);
            batalkan.setEnabled(true);
            plus.setEnabled(true);
            minus.setEnabled(true);
        }
        
        Integer harga_satuan = Integer.parseInt(total_harga_value)/Integer.parseInt(jumlah_value); 
        Integer jumlah_satuan = Integer.parseInt(jumlah_value); 
        
        
        barang.setText(barang_value);
        status.setText(status_value);
        jumlah.setText(jumlah_value);
        total_harga.setText(total_harga_value);
    }//GEN-LAST:event_tabelpembelianMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserView uv = new UserView();
        uv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Integer item_jumlah = Integer.parseInt(jumlah.getText()); 
        Integer item_harga = 0;
        DefaultTableModel model = (DefaultTableModel) tabelpembelian.getModel();
         switch(model.getValueAt(tabelpembelian.getSelectedRow(), 1).toString()){
            case "tas":
                item_harga = 120_000;
                break;
            case "tempat pensil":
                item_harga = 20_000;
                break;
            case "buku":
                item_harga = 10_000;
                break;
            case "pulpen":
                item_harga = 5_000;
                break;
        }
        DefaultTableModel mod = (DefaultTableModel) tabelpembelian.getModel();
        String id = (String) mod.getValueAt(tabelpembelian.getSelectedRow(), 0);
        this.model.updateData(Integer.parseInt(jumlah.getText()), Integer.parseInt(id), item_harga*item_jumlah);
    }//GEN-LAST:event_updateActionPerformed

    private void batalkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalkanActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mod = (DefaultTableModel) tabelpembelian.getModel();
        String id = (String) mod.getValueAt(tabelpembelian.getSelectedRow(), 0);
        this.model.dropData(Integer.parseInt(id));
    }//GEN-LAST:event_batalkanActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
        Integer jml = Integer.parseInt(jumlah.getText()) + 1; 
        jumlah.setText(jml.toString());
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:

        if(Integer.parseInt(jumlah.getText()) != 0){
            Integer jml = Integer.parseInt(jumlah.getText()) - 1; 
            jumlah.setText(jml.toString());
        }
    }//GEN-LAST:event_minusActionPerformed

    private void pesanan_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanan_selesaiActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mod = (DefaultTableModel) tabelpembelian.getModel();
        String id = (String) mod.getValueAt(tabelpembelian.getSelectedRow(), 0);
        this.model.pesananSelesai(Integer.parseInt(id));
    }//GEN-LAST:event_pesanan_selesaiActionPerformed

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
            java.util.logging.Logger.getLogger(RiwayatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiwayatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiwayatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiwayatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiwayatView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barang;
    private javax.swing.JButton batalkan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jumlah;
    private javax.swing.JButton minus;
    private javax.swing.JButton pesanan_selesai;
    private javax.swing.JButton plus;
    private javax.swing.JLabel status;
    private javax.swing.JTable tabelpembelian;
    private javax.swing.JLabel total_harga;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
