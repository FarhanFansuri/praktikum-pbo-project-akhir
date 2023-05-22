/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.MysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER 10
 */
public class AdminModel {
    Connection conn;
    Statement stm ;
    ResultSet result;
    
    //constructor hubungkan ke database
    public AdminModel() {
        try {
            this.conn = new MysqlConnection().getConnection();
            this.stm = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PembelianModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //method ambil semua data yang belum dikonfirmasi dan sudah ditolak
     public void getTableDataUpdateKonfirmasi(JTable jtable) throws SQLException{
        result = stm.executeQuery("select * from pembelian WHERE status = 'menunggu konfirmasi' OR status = 'pesanan ditolak' ");
        DefaultTableModel model = (DefaultTableModel)jtable.getModel();
        model.setRowCount(0);
        while(result.next()){
            String id = result.getString("id_barang_pembelian");
            String barang = result.getString("barang");
            String jumlah = result.getString("jumlah");
            String total_harga = result.getString("total_harga");
            String status = result.getString("status");
            String metode =result.getString("metode_pembayaran");
            model.addRow(new Object[]{id,barang,jumlah,total_harga,metode,status});
            }
      }
     
     //method ambil semua  data selain yang belum dikonfirmasi dan sudah ditolak
     public void getTableDataUpdatePengiriman(JTable jtable) throws SQLException{
        result = stm.executeQuery("select * from pembelian WHERE NOT (status = 'menunggu konfirmasi' OR status = 'pesanan ditolak')");
        DefaultTableModel model = (DefaultTableModel)jtable.getModel();
        model.setRowCount(0);
        while(result.next()){
            String id = result.getString("id_barang_pembelian");
            String barang = result.getString("barang");
            String jumlah = result.getString("jumlah");
            String total_harga = result.getString("total_harga");
            String status = result.getString("status");
            String metode =result.getString("metode_pembayaran");
            model.addRow(new Object[]{id,barang,jumlah,total_harga,metode,status});
            }
      }
     
     //method tombol update
     public void updateTabelKonfirmasi(int idBarang, String konfirmasiStatus)
     {
         try {
            // Query untuk mengupdate data
            String query = "UPDATE pembelian SET status = ?  WHERE id_barang_pembelian = ? ";

            // Membuat objek PreparedStatement
            PreparedStatement statement = conn.prepareStatement(query);

            // Mengatur nilai parameter
            statement.setString(1, konfirmasiStatus); // Misalnya, mengupdate umur menjadi 30
            statement.setInt(2, idBarang);

            // Menjalankan perintah SQL
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Data berhasil diupdate.");
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengupdate data: " + e.getMessage());
        }
     }
}
     
