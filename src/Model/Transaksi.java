package Model;

import java.util.ArrayList;

public class Transaksi 
{
    private Integer Id_transaksi;
    private Pelanggan Pelanggan;
    private Pesanan Pesanan;
    private Integer Jumlah_pesanan;
    private Integer Total_harga;
    private Integer Bayar;
    private Integer Kembalian;
 
    public Integer getId_transaksi(){
        return Id_transaksi;
    }
    
    public void setId_transaksi(Integer Id_transaksi){
        this.Id_transaksi = Id_transaksi;
    }
    
    public Pelanggan getPelanggan() {
        return Pelanggan;
    }
    
    public void setPelanggan(Pelanggan Pelanggan) {
        this.Pelanggan = Pelanggan;
    }

    public Pesanan getPesanan() {
        return Pesanan;
    }

    public void setPesanan(Pesanan Pesanan) {
        this.Pesanan = Pesanan;
    }
        
    public Integer getJumlah_pesanan(){
        return Jumlah_pesanan;
    }
    
    public void setJumlah_pesanan(Integer Jumlah_pesanan){
        this.Jumlah_pesanan = Jumlah_pesanan;
    }
    
    public Integer getTotal_Harga(){
        return Total_harga;
    }
    
    public void setTotal_harga(Integer Total_harga){
        this.Total_harga = Total_harga;
    }
    
    public Integer getBayar(){
        return Bayar;
    }
    
    public void setBayar(Integer Bayar){
        this.Bayar = Bayar;
    }
    
    public Integer getKembalian(){
        return Kembalian;
    }
    
    public void setKembalian(Integer Kembalian){
        this.Kembalian = Kembalian;
    }

}
