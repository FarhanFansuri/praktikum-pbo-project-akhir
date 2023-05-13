/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author farhan
 */
public class UserController {
    
    String namabarang;
    String akunpembayaran;
    String metodepembayaran;
    int jumlah = 0;
    
    public void tambahBarang(String namabarang){
        this.namabarang = namabarang;
        this.jumlah++;
    }
    
    public void tambahJumlah(){
        this.jumlah++;
    }
    
    public void kurangiJumlah(){
        if(this.jumlah != 0){
            this.jumlah--;
        }    
    }
    public void hapusBarang(){
        this.jumlah = 0;
    }
    
    public void pembayaran(String metode, String akunpembayaran){
        this.metodepembayaran = metode;
        this.akunpembayaran = akunpembayaran;
    }
    
    public void pesan(){
        //masukan ke database
    }
}
