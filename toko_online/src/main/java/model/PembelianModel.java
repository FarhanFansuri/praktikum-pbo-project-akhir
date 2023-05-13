/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import connection.MysqlConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author farhan
 */
public class PembelianModel {

    Connection conn;
    Statement stm ;
    ResultSet result;
    
    public PembelianModel() {
        try {
            this.conn = new MysqlConnection().getConnection();
            this.stm = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PembelianModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void addData(String barang, int jumlah, int total_harga, String metode_pembayaran){
        
        try {

            // Query untuk menambahkan data
            String query = "INSERT INTO `pembelian` (`id_barang_pembelian`, `username`, `barang`, `jumlah`, `total_harga`, `status`, `metode_pembayaran`) VALUES (NULL, 'User',?,?,?,?,?)";

            // Membuat objek PreparedStatement
            PreparedStatement statement = conn.prepareStatement(query);

            // Mengatur nilai parameter
            statement.setString(1, barang);
            statement.setInt(2, jumlah);
            statement.setInt(3, total_harga);
            statement.setString(4, "menunggu konfirmasi");
            statement.setString(5, metode_pembayaran);

            // Menjalankan perintah SQL
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Data berhasil ditambahkan.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
        }
    }

    public void getData() throws SQLException{
        result = stm.executeQuery("select * from pembelian");
        while(result.next()){
            String barang = result.getString("barang");
            System.out.println(barang);
        }
    } 
    
     public void getTableData(JTable jtable) throws SQLException{
        result = stm.executeQuery("select * from pembelian");
        DefaultTableModel model = (DefaultTableModel)jtable.getModel();
        model.setRowCount(0);
        while(result.next()){
            String id = result.getString("id_barang_pembelian");
            String barang = result.getString("barang");
            String jumlah = result.getString("jumlah");
            String total_harga = result.getString("total_harga");
            String status = result.getString("status");
            model.addRow(new Object[]{id,barang,jumlah,total_harga,status});
        }
      
        
    } 
     
     public void dropData(int id){
     
      try{
            // Query untuk menghapus data
            String query = "DELETE FROM pembelian WHERE id_barang_pembelian = ?";

            // Membuat objek PreparedStatement
            PreparedStatement statement = conn.prepareStatement(query);

            // Mengatur nilai parameter
            statement.setInt(1, id); // Misalnya, menghapus data dengan id = 1

            // Menjalankan perintah SQL
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Data berhasil dihapus.");
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menghapus data: " + e.getMessage());
        }
    }
     
     public void updateData(int jumlah_barang, int id_barang, int total_harga){
     
        try {
            // Query untuk mengupdate data
            String query = "UPDATE pembelian SET jumlah = ? , total_harga = ?  WHERE id_barang_pembelian = ? ";

            // Membuat objek PreparedStatement
            PreparedStatement statement = conn.prepareStatement(query);

            // Mengatur nilai parameter
            statement.setInt(1, jumlah_barang); // Misalnya, mengupdate umur menjadi 30
            statement.setInt(3, id_barang);
            statement.setInt(2, total_harga);// Misalnya, mengupdate data dengan id = 1

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
     
     public void pesananSelesai(int id_barang){
     
        try {
            // Query untuk mengupdate data
            String query = "UPDATE pembelian SET status = 'pesanan selesai'  WHERE id_barang_pembelian = ? ";

            // Membuat objek PreparedStatement
            PreparedStatement statement = conn.prepareStatement(query);

            // Mengatur nilai parameter
            statement.setInt(1, id_barang);
      

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

    
